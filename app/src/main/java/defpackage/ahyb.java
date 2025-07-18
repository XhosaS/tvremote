package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahyb implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ahyc ahycVar = (ahyc) obj;
        ahyc ahycVar2 = (ahyc) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(ahycVar.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(ahycVar2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(ahycVar.a.getVersion(), ahycVar2.a.getVersion());
    }
}
