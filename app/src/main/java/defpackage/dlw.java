package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dlw implements dap {
    private static final dlv a = new dlv();
    private final Context b;
    private final List c;
    private final dlv d;
    private final dlx e;

    public dlw(Context context, List list, ddz ddzVar, ddx ddxVar) {
        dlv dlvVar = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new dlx(ddzVar, ddxVar);
        this.d = dlvVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return !((Boolean) danVar.b(dmi.b)).booleanValue() && dai.c(this.c, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x03ac A[Catch: all -> 0x03c3, TryCatch #1 {all -> 0x03c3, blocks: (B:3:0x0012, B:139:0x0313, B:141:0x0319, B:142:0x032e, B:147:0x0359, B:149:0x035f, B:150:0x0376, B:152:0x037f, B:163:0x03a6, B:165:0x03ac, B:166:0x03c2), top: B:172:0x0012 }] */
    @Override // defpackage.dap
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dmb a(java.nio.ByteBuffer r21, int r22, int r23, defpackage.dan r24) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlw.a(java.nio.ByteBuffer, int, int, dan):dmb");
    }
}
