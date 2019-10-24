/**
import java.text.AttributedCharacterIterator;
import java.util.logging.Logger;



 * Hibernate, map a Boolean to Done/Pending or Y/N
 *
@Converter(autoApply = true)
public class BooleanConverter implements AttributedCharacterIterator<Boolean, String>
{
    Logger log = Logger.getLogger(BooleanConverter.class.getSimpleName());

    @Override
    public String convertToDatabaseColumn(Boolean attribute)
    {
        if (attribute != null)
        {
            if (attribute)
            {
                return "Done";
            }
            else
            {
                return "Pending";
            }
        }
        return null;
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData)
    {
        if (dbData != null)
        {
            return dbData.equals("Done");
        }
        return null;
    }


}
*/