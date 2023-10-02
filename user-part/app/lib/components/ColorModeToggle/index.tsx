import { Box } from "@chakra-ui/react";
import React from "react";
import ColorModeToggleButton from "./Button";
import ColorModeToggleIconButton from "./IconButton";

export default function ColorModeToggle(){
    return(
        <React.Fragment>
            <Box display={{
                base: "none",
                md: "initial"
            }}>
                <ColorModeToggleButton/>
            </Box>
            <Box display={{
                base: "initial",
                md: "none"
            }}>
                <ColorModeToggleIconButton/>
            </Box>
        </React.Fragment>
    )
}