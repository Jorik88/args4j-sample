package org.example;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OneArgumentOptionHandler;
import org.kohsuke.args4j.spi.Setter;

import static java.lang.String.format;

public class StringOptionHandler extends OneArgumentOptionHandler<String> {

    public StringOptionHandler(CmdLineParser parser, OptionDef option, Setter<? super String> setter) {
        super(parser, option, setter);
    }

    @Override
    protected String parse(String argument) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(argument),
                format("%s argument cannot be null or empty", option.toString()));
        return argument;
    }
}
