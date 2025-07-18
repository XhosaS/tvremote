package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gz extends gx {
    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        boolean z = false;
        if (intent == null || i != -1) {
            return false;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= intArrayExtra.length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String str = (String) obj;
        str.getClass();
        return hp.d(new String[]{str});
    }

    @Override // defpackage.gx
    public final /* bridge */ /* synthetic */ cb c(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        if (czi.b(context, str) == 0) {
            return new cb((Object) true);
        }
        return null;
    }
}
