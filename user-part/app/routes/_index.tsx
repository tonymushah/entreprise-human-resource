import { Box, Center, Heading, Text, VStack } from "@chakra-ui/react";
import type { MetaFunction } from "@remix-run/node";

export const meta: MetaFunction = () => {
  return [
    { title: "Some entreprise..." },
    { name: "description", content: "Bienvenue chez ???" },
  ];
};

export default function Index() {
  return (
    <Box>
      <Center height={"30em"}>
        <Box>
          <VStack>
            <Heading>
              Bienvenue chez ???
            </Heading>
            <Text>Decouvrez nos services dans le monde du ???</Text>
          </VStack>
        </Box>
      </Center>
    </Box>
  );
}
