import { Box, Flex, Spacer, Text } from "@chakra-ui/react";
import HeaderMenu from "./Menu";

export default function Header() {
    return (
        <Box background={"gray.100"}>
            <Flex padding={2}>
                <Text>Logo</Text>
                <Spacer />
                <HeaderMenu />
            </Flex>
        </Box>
    )
}