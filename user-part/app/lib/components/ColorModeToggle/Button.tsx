import { Button, useColorMode } from "@chakra-ui/react";
import { FiSun, FiMoon } from "react-icons/fi/index.js"

export default function ColorModeToggleButton(){
    const { colorMode, toggleColorMode } = useColorMode();
    return (
        <Button
            leftIcon={colorMode === "light" ? <FiSun/> : <FiMoon/>}
            colorScheme={"gray"}
            variant={"outline"}
            onClick={() => toggleColorMode()}
        >
            Toggle {colorMode === "light" ? "Dark" : "Light"}
        </Button>
    )
}