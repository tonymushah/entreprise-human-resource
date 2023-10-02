import { Link } from "@remix-run/react"
import { Link as ChakraLink } from "@chakra-ui/react"

// TODO Add a responsive fontSize for ChakraLink 
export default function SingleHeaderMenuItem({name, to = "."} : {
    name: string,
    to?: string
}){
    return(
        <ChakraLink as={Link} to={to} fontSize={"md"}>
            {name}
        </ChakraLink>
    )
}