package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzd implements gzf {
    public final nue a;
    private final gzc b;

    public gzd(int i, nue nueVar) {
        this.a = nueVar;
        this.b = new gzc(i, this);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.gzf
    public final gzb a(gza gzaVar) {
        rza rzaVar = (rza) this.b.get(gzaVar);
        if (rzaVar == null) {
            return null;
        }
        return new gzb((Bitmap) rzaVar.c, rzaVar.b);
    }

    @Override // defpackage.gzf
    public final void b(gza gzaVar, Bitmap bitmap, Map map) {
        map.getClass();
        gzc gzcVar = this.b;
        int iB = hjs.B(bitmap);
        if (iB <= gzcVar.maxSize()) {
            gzcVar.put(gzaVar, new rza(bitmap, map, iB));
        } else {
            gzcVar.remove(gzaVar);
            this.a.j(gzaVar, bitmap, map, iB);
        }
    }

    @Override // defpackage.gzf
    public final void c(int i) {
        if (i >= 40) {
            this.b.evictAll();
        } else {
            if (i < 10 || i >= 20) {
                return;
            }
            gzc gzcVar = this.b;
            gzcVar.trimToSize(gzcVar.size() / 2);
        }
    }
}
