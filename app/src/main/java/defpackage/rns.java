package defpackage;

import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rns {
    public final PackageManager a;
    private final Map c = new HashMap();
    int b = 0;

    public rns(PackageManager packageManager) {
        this.a = packageManager;
    }

    public static String b(String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    public final rnr a(final String str) {
        Map map = this.c;
        rnr rnrVar = (rnr) map.get(str);
        if (rnrVar != null) {
            return rnrVar;
        }
        rnr rnrVar2 = new rnr(this, str, new rnm(new yrp() { // from class: rnl
            @Override // defpackage.yrp
            public final Object eV() {
                rns rnsVar = this.a;
                String str2 = str;
                try {
                    return Integer.valueOf(rnsVar.a.getPackageInfo(str2, 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(str2)));
                    return null;
                }
            }
        }));
        map.put(str, rnrVar2);
        return rnrVar2;
    }
}
