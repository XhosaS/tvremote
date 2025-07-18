package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mac implements lzs {
    private final yqt a;
    private final maa b;
    private final mae c;

    public mac(Executor executor, yqt yqtVar, maa maaVar) {
        this.a = yqtVar;
        this.b = maaVar;
        this.c = new mae(executor, new agux() { // from class: mab
            @Override // defpackage.agux
            public final Object a(Object obj) throws lzt {
                lzw lzwVar = (lzw) obj;
                lzwVar.getClass();
                mac macVar = this.a;
                if (macVar.b(lzwVar) == null) {
                    return null;
                }
                macVar.c(lzwVar);
                return null;
            }
        });
    }

    @Override // defpackage.lzs
    public final zyd a(final lzw lzwVar) {
        vrf vrfVar;
        final mae maeVar = this.c;
        synchronized (maeVar.c) {
            Map map = maeVar.d;
            Object vrfVar2 = map.get(lzwVar);
            if (vrfVar2 == null) {
                vrfVar2 = new vrf(new zvh() { // from class: mad
                    @Override // defpackage.zvh
                    public final zyd a() {
                        maeVar.b.a(lzwVar);
                        return zxy.a;
                    }
                }, maeVar.a);
                map.put(lzwVar, vrfVar2);
            }
            vrfVar = (vrf) vrfVar2;
        }
        return vrfVar.b();
    }

    public final Throwable b(lzw lzwVar) {
        try {
            final mag magVar = (mag) ((yqz) this.a).a;
            mai.a.a(lzwVar.b(), new agux() { // from class: maf
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    vdf.a(magVar.a, str);
                    return agpu.a;
                }
            });
            this.b.a(lzwVar, lzu.c);
            return null;
        } catch (UnsatisfiedLinkError e) {
            return e;
        }
    }

    public final void c(lzw lzwVar) throws lzt {
        try {
            mai.a.a(lzwVar.a(), new agux() { // from class: lzx
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    System.loadLibrary(str);
                    return agpu.a;
                }
            });
            this.b.a(lzwVar, lzu.b);
        } catch (UnsatisfiedLinkError e) {
            throw new lzt("Error while loading ".concat(lzwVar.a()), e);
        }
    }
}
