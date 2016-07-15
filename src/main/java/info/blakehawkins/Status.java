package info.blakehawkins;

import javax.validation.constraints.NotNull;

public class Status
{
    final String response;

    public Status(@NotNull String response)
    {
        this.response = response;
    }
}
