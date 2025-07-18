package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ptn {
    public static ptm a(Context context, pkn pknVar) {
        try {
            return ptm.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", ptm.NEW_FILE_KEY.d));
        } catch (IllegalArgumentException unused) {
            pknVar.a();
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return ptm.USE_CHECKSUM_ONLY;
        }
    }

    static boolean b(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean c(Context context, ptm ptmVar) {
        ptmVar.name();
        int i = qce.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", ptmVar.d).commit();
    }

    public static void d(Context context) {
        int i = qce.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }
}
