package defpackage;

import android.content.pm.PackageManager;
import android.util.Log;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rzm implements ttm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rzm(nuh nuhVar, String str, int i) {
        this.c = i;
        this.a = nuhVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ttm
    public final Object get() {
        if (this.c == 0) {
            Object obj = this.b;
            try {
                return Integer.valueOf(((PackageManager) ((nuh) this.a).c).getPackageInfo((String) obj, 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(obj)));
                return null;
            }
        }
        Object obj2 = ((ulp) this.b).a;
        Object obj3 = ((unc) obj2).d;
        String str = ((nsw) this.a).j;
        synchronized (obj3) {
            Map map = (Map) ((unc) obj2).b.get(str);
            if (map == null) {
                return ImmutableSet.of();
            }
            ImmutableSet.Builder builder = ImmutableSet.builder();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                builder.addAll((Iterable) it.next());
            }
            return builder.build();
        }
    }

    public /* synthetic */ rzm(ulp ulpVar, ntg ntgVar, int i) {
        this.c = i;
        this.b = ulpVar;
        this.a = ntgVar;
    }
}
