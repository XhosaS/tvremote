package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ita implements ism {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/smarthome/schemabuilders/RemoteControlSchemaBuilder");
    private final gol b;
    private final String c;

    public ita(gol golVar) {
        golVar.getClass();
        this.b = golVar;
        this.c = "action.devices.traits.RemoteControl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ism
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.isz
            if (r0 == 0) goto L13
            r0 = r6
            isz r0 = (defpackage.isz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            isz r0 = new isz
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.agpl.b(r6)
            gol r6 = r5.b
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto Ld3
        L3c:
            java.util.List r6 = (java.util.List) r6
            java.util.Map r0 = defpackage.irn.a
            java.util.Map r0 = defpackage.irn.a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L4f
        L71:
            java.util.Set r6 = r1.keySet()
            zdy r0 = defpackage.ita.a
            zeo r0 = r0.b()
            r1 = 29
            java.lang.String r2 = "RemoteControlSchemaBuilder.kt"
            java.lang.String r3 = "com/google/android/apps/tvsearch/smarthome/schemabuilders/RemoteControlSchemaBuilder"
            java.lang.String r4 = "buildAttributesMap"
            zeo r0 = r0.q(r3, r4, r1, r2)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "Building remote control attributes. Supported buttons: %s"
            r0.x(r1, r6)
            abaq r0 = new abaq
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L97:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            abau r2 = new abau
            r2.<init>()
            abax r3 = new abax
            r3.<init>(r1)
            java.lang.String r1 = "key"
            r2.k(r1, r3)
            abax r1 = new abax
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r3)
            java.lang.String r3 = "virtual"
            r2.k(r3, r1)
            java.util.ArrayList r1 = r0.a
            r1.add(r2)
            goto L97
        Lc7:
            agpi r6 = new agpi
            java.lang.String r1 = "remoteControlButtons"
            r6.<init>(r1, r0)
            java.util.Map r6 = defpackage.agrj.c(r6)
            return r6
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ita.a(agsw):java.lang.Object");
    }

    @Override // defpackage.ism
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return true;
    }
}
