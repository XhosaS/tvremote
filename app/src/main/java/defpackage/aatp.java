package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatp {
    private final Context a;
    private final Set b;
    private final Set c;
    private final yqt d;
    private final agow e;
    private final agow f;
    private final agow g;
    private final yqt h;
    private volatile aato i;
    private final Object j = new Object();

    public aatp(Context context, Set set, Set set2, yqt yqtVar, agow agowVar, agow agowVar2, agow agowVar3, yqt yqtVar2) {
        this.a = context;
        this.b = set;
        this.c = set2;
        this.d = yqtVar;
        this.e = agowVar;
        this.f = agowVar2;
        this.g = agowVar3;
        this.h = yqtVar2;
    }

    private final yqt b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CronetProvider cronetProvider = (CronetProvider) it.next();
            if (cronetProvider.getName().equals(str) && cronetProvider.isEnabled()) {
                yqt.i(str);
                return yqt.i(cronetProvider);
            }
        }
        return ypv.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6 A[Catch: all -> 0x0236, IllegalStateException -> 0x0238, TryCatch #4 {IllegalStateException -> 0x0238, blocks: (B:12:0x002e, B:14:0x0035, B:24:0x0089, B:25:0x008d, B:27:0x0093, B:28:0x00a9, B:30:0x00b5, B:33:0x00bc, B:34:0x00c3, B:35:0x00c4, B:37:0x00ca, B:40:0x00d1, B:41:0x00d8, B:42:0x00d9, B:43:0x00e4, B:45:0x00ea, B:46:0x010d, B:53:0x0153, B:55:0x0168, B:57:0x0181, B:66:0x01d0, B:68:0x01e6, B:69:0x01f0, B:71:0x01f6, B:72:0x0200, B:73:0x020a, B:75:0x0210, B:76:0x021a, B:65:0x01ca, B:58:0x0195, B:60:0x019e, B:62:0x01aa, B:64:0x01c3, B:80:0x022a, B:81:0x022d, B:15:0x003b, B:17:0x004b, B:18:0x0058, B:20:0x0064, B:21:0x0071, B:23:0x007d, B:82:0x022e, B:83:0x0235), top: B:105:0x002e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aato a(boolean r18) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aatp.a(boolean):aato");
    }
}
