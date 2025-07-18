package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbq implements Comparator {
    private final /* synthetic */ int a;

    public zbq(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return Double.compare(((wfz) obj2).a, ((wfz) obj).a);
            }
            zyh zyhVar = (zyh) obj;
            zyh zyhVar2 = (zyh) obj2;
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(zyhVar.a.getName())) {
                return 1;
            }
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(zyhVar2.a.getName())) {
                return -1;
            }
            return -CronetEngine.Builder.compareVersions(zyhVar.a.getVersion(), zyhVar2.a.getVersion());
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        int iMin = Math.min(str.length(), str2.length());
        int i2 = 4;
        while (true) {
            if (i2 >= iMin) {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            } else {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2) {
                    i2++;
                } else if (yks.a(cCharAt, cCharAt2) >= 0) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
