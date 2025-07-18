package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctx {
    public static final jp a = new jp(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final ko d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new rhw(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ko();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((ctt) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212 A[Catch: all -> 0x0243, Merged into TryCatch #2 {all -> 0x0311, all -> 0x0243, all -> 0x028a, blocks: (B:8:0x0025, B:9:0x002c, B:11:0x0032, B:19:0x0067, B:45:0x0103, B:91:0x0221, B:104:0x0244, B:105:0x0247, B:106:0x0248, B:42:0x00f6, B:43:0x00fa, B:114:0x028b, B:115:0x028e, B:46:0x010a, B:89:0x0212, B:90:0x0215, B:100:0x023c, B:101:0x023f, B:102:0x0242, B:12:0x0047, B:16:0x0052, B:21:0x0070, B:23:0x0076, B:25:0x007e, B:27:0x0091, B:28:0x00a1, B:29:0x00a7, B:31:0x00ad, B:40:0x00ec, B:35:0x00cd, B:37:0x00d3, B:39:0x00e9, B:41:0x00f3, B:109:0x0252, B:110:0x0272, B:111:0x0273, B:112:0x0289, B:15:0x004c), top: B:170:0x0025 }, TRY_ENTER] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zuw b(java.lang.String r28, android.content.Context r29, java.util.List r30, int r31) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctx.b(java.lang.String, android.content.Context, java.util.List, int):zuw");
    }
}
