import { HStack } from "@chakra-ui/react";
import SingleHeaderMenuItem from "./Single";
import ColorModeToggle from "../../ColorModeToggle";

// TODO Add responsive value for HStack spacing
export default function HeaderMenu(){
    return (
        <HStack spacing={2}>
            <SingleHeaderMenuItem name="Acceuil"/>
            <SingleHeaderMenuItem name="Recrutements"/>
            <SingleHeaderMenuItem name="Services"/>
            <SingleHeaderMenuItem name="A propos"/>
            <ColorModeToggle/>
        </HStack>
    );
}