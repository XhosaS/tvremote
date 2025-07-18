package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kul extends lcn {
    public long a;
    public String b;

    public kul(lbk lbkVar) {
        super(lbkVar);
    }

    @Override // defpackage.lcn
    protected final boolean a() {
        Calendar calendar = Calendar.getInstance();
        this.a = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        this.b = locale.getLanguage().toLowerCase(Locale.ENGLISH) + "-" + locale.getCountry().toLowerCase(Locale.ENGLISH);
        return false;
    }
}
