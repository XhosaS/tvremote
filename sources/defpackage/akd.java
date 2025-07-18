package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akd implements akg {
    @Override // defpackage.akg
    public final int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        int i = aki.b;
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (ii.X(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.akg
    public final int b(Context context, String str, boolean z) {
        return aki.a(context, str, z);
    }
}
