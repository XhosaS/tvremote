package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.tv.remote.service.IAtvSearchAssistantService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gor implements gol {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl");
    public IAtvSearchAssistantService b;
    private final Context c;
    private final vrs d;

    public gor(Context context, vrs vrsVar) {
        context.getClass();
        this.c = context;
        this.d = vrsVar;
        d(new agum() { // from class: gon
            @Override // defpackage.agum
            public final Object a() {
                return agpu.a;
            }
        });
    }

    private final void d(agum agumVar) {
        goo gooVar = new goo(this, agumVar);
        ComponentName componentName = irm.a;
        ComponentName componentName2 = irm.f;
        Intent component = new Intent(componentName2.getClassName()).setPackage("com.google.android.tv.remote.service").setComponent(componentName2);
        component.getClass();
        try {
            this.c.bindService(component, gooVar, 65);
        } catch (SecurityException e) {
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl", "connectToAtvSearchAssistantServiceAndRun", 113, "KeyCodeInjectorImpl.kt")).u("ATV Search Assistant service binding failure");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [agtg] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.Collection] */
    @Override // defpackage.gol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gop
            if (r0 == 0) goto L13
            r0 = r8
            gop r0 = (defpackage.gop) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gop r0 = new gop
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r0 = r0.a
            defpackage.agpl.b(r8)     // Catch: defpackage.vsq -> L7d
            goto L5a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.agpl.b(r8)
            vrs r8 = r7.d     // Catch: defpackage.vsq -> L7d
            android.net.Uri r2 = defpackage.vel.a     // Catch: defpackage.vsq -> L7d
            r2.getClass()     // Catch: defpackage.vsq -> L7d
            yyk r4 = defpackage.vel.b     // Catch: defpackage.vsq -> L7d
            r4.getClass()     // Catch: defpackage.vsq -> L7d
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: defpackage.vsq -> L7d
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch: defpackage.vsq -> L7d
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: defpackage.vsq -> L7d
            goq r5 = new goq     // Catch: defpackage.vsq -> L7d
            r5.<init>()     // Catch: defpackage.vsq -> L7d
            r6 = -1
            r0.a = r6     // Catch: defpackage.vsq -> L7d
            r0.d = r3     // Catch: defpackage.vsq -> L7d
            java.lang.Object r8 = r8.c(r2, r4, r5, r0)     // Catch: defpackage.vsq -> L7d
            if (r8 == r1) goto L7c
            r0 = r6
        L5a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: defpackage.vsq -> L7d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: defpackage.vsq -> L7d
            r1.<init>()     // Catch: defpackage.vsq -> L7d
            java.util.Iterator r8 = r8.iterator()     // Catch: defpackage.vsq -> L7d
        L65:
            boolean r2 = r8.hasNext()     // Catch: defpackage.vsq -> L7d
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r8.next()     // Catch: defpackage.vsq -> L7d
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: defpackage.vsq -> L7d
            int r3 = r3.intValue()     // Catch: defpackage.vsq -> L7d
            if (r3 == r0) goto L65
            r1.add(r2)     // Catch: defpackage.vsq -> L7d
            goto L65
        L7c:
            return r1
        L7d:
            r8 = move-exception
            zdy r0 = defpackage.gor.a
            zeo r0 = r0.b()
            zdv r0 = (defpackage.zdv) r0
            zeo r8 = r0.p(r8)
            r0 = 77
            java.lang.String r1 = "KeyCodeInjectorImpl.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl"
            java.lang.String r3 = "getSupportedKeyCodes"
            zeo r8 = r8.q(r2, r3, r0, r1)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r0 = "Content provider query failed. Returning no supported key codes. This is expected for older versions of the ATV Remote app that only have legacy key code support."
            r8.u(r0)
            agrd r8 = defpackage.agrd.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gor.a(agsw):java.lang.Object");
    }

    @Override // defpackage.gol
    public final /* synthetic */ void b(final int i) {
        if (this.b == null) {
            d(new agum() { // from class: gom
                @Override // defpackage.agum
                public final Object a() {
                    this.a.c(i);
                    return agpu.a;
                }
            });
        } else {
            c(i);
        }
    }

    public final void c(int i) {
        IAtvSearchAssistantService iAtvSearchAssistantService = this.b;
        if (iAtvSearchAssistantService == null) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl", "sendKeyEventToAtvService", 131, "KeyCodeInjectorImpl.kt")).v("Attempted to inject keycode[%d] with null AtvSearchAssistantService.", i);
            return;
        }
        try {
            if (iAtvSearchAssistantService.f()) {
                iAtvSearchAssistantService.e(i);
            } else {
                ((zdv) a.d().q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl", "sendKeyEventToAtvService", 123, "KeyCodeInjectorImpl.kt")).u("Search assistant not set, keyEvent was not sent");
            }
        } catch (RemoteException e) {
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl", "sendKeyEventToAtvService", 126, "KeyCodeInjectorImpl.kt")).u("ATV Search assistant service failure");
        }
    }
}
