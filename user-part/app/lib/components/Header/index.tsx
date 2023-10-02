import { Box, HStack, Spacer, Text, useColorModeValue } from "@chakra-ui/react";
import HeaderMenu from "./Menu";

export default function Header() {
    const background = useColorModeValue("gray.100", "gray.700");
    return (
        <Box background={background}>
            <HStack padding={2}>
                <Text>Logo</Text>
                <Spacer />
                <HeaderMenu />
            </HStack>
        </Box>
    )
}