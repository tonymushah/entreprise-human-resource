import { IconButton, useColorMode } from "@chakra-ui/react";
import { FiSun, FiMoon } from "react-icons/fi"

export default function ColorModeToggleIconButton(){
    const { colorMode, toggleColorMode } = useColorMode();
    return (
        <IconButton
            icon={colorMode === "light" ? <FiSun/> : <FiMoon/>}
            colorScheme={"gray"}
            variant={"outline"}
            aria-label={`Toggle ${colorMode === "light" ? "Dark" : "Light"}`}
            onClick={() => toggleColorMode()}
        />
    )
}