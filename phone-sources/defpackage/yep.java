package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yep implements xso {
    private static final ThreadLocal b = new ThreadLocal();
    public final vvj a;
    private final vvq c;

    public yep(vvj vvjVar) {
        vvjVar.getClass();
        this.a = vvjVar;
        this.c = vvjVar.u();
    }

    @Override // defpackage.xso
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new yeo((vvj) obj, this.c);
    }

    @Override // defpackage.xso
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) throws IOException {
        byte[] bArr;
        if (inputStream instanceof yeo) {
            yeo yeoVar = (yeo) inputStream;
            if (yeoVar.b == this.c) {
                try {
                    vvj vvjVar = yeoVar.a;
                    if (vvjVar != null) {
                        return vvjVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            vte vteVarL = null;
            if (inputStream instanceof xrj) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    ThreadLocal threadLocal = b;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    vteVarL = vte.S(bArr, iAvailable);
                } else if (iAvailable == 0) {
                    return this.a;
                }
            }
            if (vteVarL == null) {
                vteVarL = vte.L(inputStream);
            }
            vteVarL.e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            try {
                Object objG = this.c.g(vteVarL, yer.a);
                try {
                    vteVarL.z(0);
                    return objG;
                } catch (vuq e) {
                    throw e;
                }
            } catch (vuq e2) {
                throw new xtn(xtk.j.e("Invalid protobuf byte sequence").d(e2));
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
