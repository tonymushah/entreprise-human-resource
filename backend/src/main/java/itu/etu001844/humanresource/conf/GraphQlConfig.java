package itu.etu001844.humanresource.conf;

import java.util.regex.Pattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.Scalars;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class GraphQlConfig {
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        GraphQLScalarType address = ExtendedScalars
                .newAliasedScalar("Address")
                .aliasedScalar(Scalars.GraphQLString)
                .build();
        GraphQLScalarType email = ExtendedScalars.newRegexScalar("Email")
                .addPattern(Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE))
                .build();
        return wiringBuilder -> wiringBuilder
                .scalar(ExtendedScalars.Date)
                .scalar(ExtendedScalars.UUID)
                .scalar(address)
                .scalar(email);
    }
}
