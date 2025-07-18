package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ot {
    public static final mh a = new mh(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final mi d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new bas(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new mi();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((op) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0307, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208 A[Catch: all -> 0x0239, Merged into TryCatch #5 {all -> 0x0307, all -> 0x0280, all -> 0x0239, blocks: (B:8:0x0025, B:9:0x002c, B:11:0x0032, B:15:0x005d, B:41:0x00f9, B:87:0x0217, B:100:0x023a, B:101:0x023d, B:102:0x023e, B:38:0x00ec, B:39:0x00f0, B:110:0x0281, B:111:0x0284, B:12:0x0046, B:17:0x0066, B:19:0x006c, B:21:0x0074, B:23:0x0087, B:24:0x0097, B:25:0x009d, B:27:0x00a3, B:36:0x00e2, B:31:0x00c3, B:33:0x00c9, B:35:0x00df, B:37:0x00e9, B:105:0x0248, B:106:0x0268, B:107:0x0269, B:108:0x027f, B:42:0x0100, B:85:0x0208, B:86:0x020b, B:96:0x0232, B:97:0x0235, B:98:0x0238), top: B:171:0x0025 }, TRY_ENTER] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dln b(java.lang.String r28, android.content.Context r29, java.util.List r30, int r31) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot.b(java.lang.String, android.content.Context, java.util.List, int):dln");
    }
}
