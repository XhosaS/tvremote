package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlc implements hld {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hlc(hmi hmiVar, hok hokVar, int i) {
        this.c = i;
        this.b = hmiVar;
        this.a = hokVar;
    }

    @Override // defpackage.hld
    public final boolean a(hky hkyVar) throws Throwable {
        hsl hslVar;
        Object obj;
        int i = this.c;
        if (i == 0) {
            try {
                return hkyVar.e((InputStream) this.a, (hok) this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return hkyVar.f((ByteBuffer) this.a, (hok) this.b);
            } finally {
                hwc.b((ByteBuffer) this.a);
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(((hmi) this.b).a().getFileDescriptor());
            obj = this.a;
            hslVar = new hsl(fileInputStream, (hok) obj);
        } catch (Throwable th) {
            th = th;
            hslVar = null;
        }
        try {
            boolean zE = hkyVar.e(hslVar, (hok) obj);
            hslVar.b();
            ((hmi) this.b).a();
            return zE;
        } catch (Throwable th2) {
            th = th2;
            if (hslVar != null) {
                hslVar.b();
            }
            ((hmi) this.b).a();
            throw th;
        }
    }

    public hlc(Object obj, hok hokVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = hokVar;
    }
}
