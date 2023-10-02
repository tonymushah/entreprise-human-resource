import { ChakraProvider, Box, Heading } from "@chakra-ui/react";
import type { MetaFunction } from "@remix-run/node";
import {
  Links,
  LiveReload,
  Meta,
  Outlet,
  Scripts,
  ScrollRestoration,
  isRouteErrorResponse,
  useRouteError,
} from "@remix-run/react";
import Header from "./lib/components/Header";

export const meta: MetaFunction = () => ([{
  charset: "utf-8",
  viewport: "width=device-width,initial-scale=1",
}]);

function Document({
  children,
  title = "App title",
}: {
  children: React.ReactNode;
  title?: string;
}) {
  return (
    <html lang="en">
      <head>
        <Meta />
        <title>{title}</title>
        <Links />
      </head>
      <body>
        {children}
        <ScrollRestoration />
        <Scripts />
        <LiveReload />
      </body>
    </html>
  );
}

export default function App() {
  // throw new Error("💣💥 Booooom");

  return (
    <Document>
      <ChakraProvider>
        <Header/>
        <Outlet />
      </ChakraProvider>
    </Document>
  );
}

// How ChakraProvider should be used on CatchBoundary
export function ErrorBoundary() {
  const caught = useRouteError();

  if (isRouteErrorResponse(caught)) {
    return (
      <Document title={`${caught.status} ${caught.statusText}`}>
        <ChakraProvider>
          <Box>
            <Heading as="h1" bg="purple.600">
              [CatchBoundary]: {caught.status} {caught.statusText}
            </Heading>
          </Box>
        </ChakraProvider>
      </Document>
    )
  } else if (caught instanceof Error) {
    return (
      <SpecialErrorBoundary error={caught} />
    )
  } else {
    return (
      <Document title="Error!">
        <ChakraProvider>
          <Box>
            <Heading as="h1" bg="blue.500">
              [ErrorBoundary]: There was an unknown error
            </Heading>
          </Box>
        </ChakraProvider>
      </Document>
    )
  }

}

// How ChakraProvider should be used on ErrorBoundary
function SpecialErrorBoundary({ error }: { error: Error }) {
  return (
    <Document title="Error!">
      <ChakraProvider>
        <Box>
          <Heading as="h1" bg="blue.500">
            [ErrorBoundary]: There was an error: {error.message}
          </Heading>
        </Box>
      </ChakraProvider>
    </Document>
  );
}