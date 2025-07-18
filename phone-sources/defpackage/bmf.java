package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmf extends ykt implements yjk {
    private final /* synthetic */ int v;
    public static final bmf u = new bmf(20);
    public static final bmf t = new bmf(19);
    public static final bmf s = new bmf(18);
    public static final bmf r = new bmf(17);
    public static final bmf q = new bmf(16);
    public static final bmf p = new bmf(15);
    public static final bmf o = new bmf(14);
    public static final bmf n = new bmf(13);
    public static final bmf m = new bmf(12);
    public static final bmf l = new bmf(11);
    public static final bmf k = new bmf(10);
    public static final bmf j = new bmf(9);
    public static final bmf i = new bmf(8);
    public static final bmf h = new bmf(7);
    public static final bmf g = new bmf(6);
    public static final bmf f = new bmf(5);
    public static final bmf e = new bmf(4);
    public static final bmf d = new bmf(3);
    public static final bmf c = new bmf(2);
    public static final bmf b = new bmf(1);
    public static final bmf a = new bmf(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmf(int i2) {
        super(0);
        this.v = i2;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        Choreographer choreographer;
        boolean z = false;
        byte[] bArr = null;
        switch (this.v) {
            case 0:
                return a.p();
            case 1:
                return true;
            case 2:
                return bnj.A();
            case 3:
                return ygi.a;
            case 4:
            case 5:
                return null;
            case 6:
                return new bys(z, 3, bArr);
            case 7:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw new yfs();
            case 8:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw new yfs();
            case 9:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw new yfs();
            case 10:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw new yfs();
            case 11:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw new yfs();
            case 12:
                if (cbp.l()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    yot yotVar = ypk.a;
                    choreographer = (Choreographer) ykr.n(yxi.a, new cbw(null, 0));
                }
                cbz cbzVar = new cbz(choreographer, crh.k(Looper.getMainLooper()));
                return cbzVar.plus(cbzVar.j);
            case 13:
            case 14:
                return null;
            case 15:
                ccq.a("LocalAutofillManager");
                throw new yfs();
            case 16:
                ccq.a("LocalAutofillTree");
                throw new yfs();
            case 17:
                ccq.a("LocalClipboard");
                throw new yfs();
            case 18:
                ccq.a("LocalClipboardManager");
                throw new yfs();
            case 19:
                return true;
            default:
                ccq.a("LocalDensity");
                throw new yfs();
        }
    }
}
