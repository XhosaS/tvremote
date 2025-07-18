package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooi {
    static final String a;
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        String str = String.format(Locale.US, "INSERT INTO %1$s(%2$s, %3$s) ", "geller_database_info_table", "key", "info");
        b = str;
        String str2 = String.format(Locale.US, "SELECT '%1$s', ABS(RANDOM() %% %2$d) ", "database_id", Integer.MAX_VALUE);
        c = str2;
        String str3 = String.format(Locale.US, "WHERE NOT EXISTS (SELECT 1 FROM %1$s WHERE %2$s = '%3$s');", "geller_database_info_table", "key", "database_id");
        d = str3;
        a = str + str2 + str3;
    }
}
