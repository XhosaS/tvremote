package defpackage;

import com.google.common.collect.Sets;
import j$.time.Instant;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpb implements wnu {
    public static final zdy a = zdy.h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    static final long b = TimeUnit.DAYS.toMillis(30);
    public final vhq c;
    public final vib d;
    public final vhn e;
    public final zyg f;
    public final zyg g;
    public final vor h;
    private final zwv i;

    public vpb(vhq vhqVar, vib vibVar, vhn vhnVar, zyg zygVar, zyg zygVar2, vor vorVar, zwv zwvVar) {
        this.c = vhqVar;
        this.d = vibVar;
        this.e = vhnVar;
        this.f = zygVar;
        this.g = zygVar2;
        this.h = vorVar;
        this.i = zwvVar;
    }

    @Override // defpackage.wnu
    public final zyd a() {
        zvh zvhVarB = wyo.b(new zvh() { // from class: vox
            @Override // defpackage.zvh
            public final zyd a() {
                final vpb vpbVar = this.a;
                ujk ujkVar = vpbVar.d.c;
                final zyd zydVarB = vpbVar.b();
                zyd zydVarH = zuz.h(zwx.u(ujkVar.c()), wyo.c(new zvi() { // from class: vot
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        vii viiVar = (vii) obj;
                        return ((viiVar.b & 1) == 0 || Math.abs(Instant.now().toEpochMilli() - viiVar.c) >= vpb.b) ? zuz.g(vpbVar.e.a(), wyo.a(new yqi() { // from class: vpa
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                zdy zdyVar = vpb.a;
                                return true;
                            }
                        }), zwk.a) : zxn.h(false);
                    }
                }), vpbVar.g);
                zvi zviVarC = wyo.c(new zvi() { // from class: vou
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return ((Boolean) obj).booleanValue() ? vpbVar.b() : zxy.a;
                    }
                });
                zyg zygVar = vpbVar.f;
                final zyd zydVarH2 = zuz.h(zydVarH, zviVarC, zygVar);
                return zxn.b(zydVarB, zydVarH2).a(wyo.i(new Callable() { // from class: vov
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zdy zdyVar = vpb.a;
                        zxn.o(zydVarB);
                        zxn.o(zydVarH2);
                        return null;
                    }
                }), zygVar);
            }
        });
        zyg zygVar = this.f;
        return zud.g(zxn.l(zvhVarB, zygVar), Throwable.class, wyo.a(new yqi() { // from class: voy
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                ((zdv) ((zdv) ((zdv) vpb.a.c()).p((Throwable) obj)).q("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 90, "WipeoutAccountsSynclet.java")).u("Wipeout accounts task failed.");
                return null;
            }
        }), zygVar);
    }

    final zyd b() {
        return this.i.b(wyo.b(new zvh() { // from class: voz
            @Override // defpackage.zvh
            public final zyd a() {
                zcp zcpVar = zcp.b;
                final vpb vpbVar = this.a;
                yyk yykVarA = vpbVar.h.a(null, zcpVar);
                yzo yzoVar = new yzo();
                int i = ((zcg) yykVarA).d;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = (File) yykVarA.get(i2);
                    try {
                        yzoVar.c(Integer.valueOf(Integer.parseInt(file.getName())));
                    } catch (NumberFormatException e) {
                        ((zdv) ((zdv) ((zdv) vpb.a.c()).p(e)).q("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java")).x("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                }
                final yzq yzqVarF = yzoVar.f();
                return zuz.h(vpbVar.c.h(), wyo.c(new zvi() { // from class: vow
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        yzq yzqVarF2 = Sets.c(yzqVarF, (Set) obj).f();
                        vor vorVar = vpbVar.h;
                        yyk yykVarA2 = vorVar.a(yzqVarF2, null);
                        final ArrayList arrayList = new ArrayList();
                        int i3 = ((zcg) yykVarA2).d;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayList.add(vorVar.a.a((File) yykVarA2.get(i4)));
                        }
                        return zxn.a(arrayList).a(new Callable() { // from class: vop
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    zxn.o((zyd) it.next());
                                }
                                return null;
                            }
                        }, zwk.a);
                    }
                }), vpbVar.g);
            }
        }), this.g);
    }
}
