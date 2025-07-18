package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fab {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder");
    private static final Uri d;
    private static final Uri e;
    public final String b;
    public final String c;
    private final fiu f;
    private final jlr g;
    private final agow h;
    private final vxe i;
    private final vrs j;
    private final agte k;
    private final ahbt l;
    private final vyb m;
    private final gph n;
    private final gzu o;
    private final zyg p;
    private final gtu q;
    private final icj r;
    private final zyg s;
    private final fmg t;
    private final ztw u;
    private final fad v;
    private final agow w;
    private final ahni x;

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.apps.tv.launcherx.config.contentprovider.LauncherXKatnissConfigContentProvider").appendPath("path_query").build();
        uriBuild.getClass();
        d = uriBuild;
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority("com.google.android.tvlauncher.contentprovider.WatsonKatnissConfigContentProvider").appendPath("path_query").build();
        uriBuild2.getClass();
        e = uriBuild2;
    }

    public fab(fiu fiuVar, jlr jlrVar, agow agowVar, vxe vxeVar, vrs vrsVar, agte agteVar, ahbt ahbtVar, vyb vybVar, gph gphVar, gzu gzuVar, zyg zygVar, gtu gtuVar, icj icjVar, zyg zygVar2, fmg fmgVar, ztw ztwVar, fad fadVar, agow agowVar2) {
        fiuVar.getClass();
        jlrVar.getClass();
        agowVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        gzuVar.getClass();
        zygVar.getClass();
        gtuVar.getClass();
        zygVar2.getClass();
        ztwVar.getClass();
        fadVar.getClass();
        agowVar2.getClass();
        this.f = fiuVar;
        this.g = jlrVar;
        this.h = agowVar;
        this.i = vxeVar;
        this.j = vrsVar;
        this.k = agteVar;
        this.l = ahbtVar;
        this.m = vybVar;
        this.n = gphVar;
        this.o = gzuVar;
        this.p = zygVar;
        this.q = gtuVar;
        this.r = icjVar;
        this.s = zygVar2;
        this.t = fmgVar;
        this.u = ztwVar;
        this.v = fadVar;
        this.w = agowVar2;
        this.x = new ahnm(false);
        this.b = "atv.assistant.params";
        this.c = "assistant.api.params.AtvAssistantParams";
    }

    private final zyd f() {
        gph gphVar = this.n;
        Uri uri = d;
        if (gphVar == gph.b || gphVar == gph.c) {
            agow agowVar = this.w;
            uri = e;
            if (!((Boolean) agowVar.a()).booleanValue()) {
                return zxy.a;
            }
        }
        try {
            zyd zydVarB = this.m.b(new vxy(new vxc(this.i, uri, new String[]{"config_data"}), new yqi() { // from class: vwz
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    ArrayList arrayList = new ArrayList(cursor.getCount());
                    if (cursor.moveToFirst()) {
                        do {
                            zdy zdyVar = fab.a;
                            byte[] blob = null;
                            if (cursor != null && cursor.getColumnCount() == 1) {
                                blob = cursor.getBlob(0);
                            }
                            arrayList.add(blob);
                        } while (cursor.moveToNext());
                    }
                    return arrayList;
                }
            }, this.p), vyr.DONT_CARE);
            yqi yqiVar = new yqi() { // from class: ezr
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    zdy zdyVar = fab.a;
                    List list = (List) obj;
                    if (list.size() == 1) {
                        return (byte[]) list.get(0);
                    }
                    return null;
                }
            };
            return zuz.g(zydVarB, wyo.a(yqiVar), this.s);
        } catch (UnsupportedOperationException e2) {
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder", "queryLauncherConfigContentProvider", 334, "AtvAssistantParamsBuilder.kt")).u("Failed to query content provider from Launcher.");
            return zxy.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r0 != r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        if (r0 != r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fab.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fab.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x002d, B:19:0x0040, B:29:0x0075, B:31:0x007b, B:33:0x0091), top: B:43:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [fmy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ahni] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.fmy r8, defpackage.agsw r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ezw
            if (r0 == 0) goto L13
            r0 = r9
            ezw r0 = (defpackage.ezw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ezw r0 = new ezw
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.a
            ahni r8 = (defpackage.ahni) r8
            defpackage.agpl.b(r9)     // Catch: java.lang.Throwable -> L44
            goto L96
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            fmy r2 = (defpackage.fmy) r2
            defpackage.agpl.b(r9)     // Catch: java.lang.Throwable -> L44
            goto L75
        L44:
            r9 = move-exception
            goto La0
        L46:
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            fmy r2 = (defpackage.fmy) r2
            defpackage.agpl.b(r9)
            r9 = r8
            r8 = r2
            goto L63
        L52:
            defpackage.agpl.b(r9)
            ahni r9 = r7.x
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto La4
        L63:
            fiu r2 = r7.f     // Catch: java.lang.Throwable -> L9c
            r0.a = r8     // Catch: java.lang.Throwable -> L9c
            r0.b = r9     // Catch: java.lang.Throwable -> L9c
            r0.e = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r2.i(r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 == r1) goto La4
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L75:
            boolean r9 = defpackage.agvy.c(r9, r2)     // Catch: java.lang.Throwable -> L44
            if (r9 != 0) goto L96
            fiu r9 = r7.f     // Catch: java.lang.Throwable -> L44
            r0.a = r8     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r0.b = r4     // Catch: java.lang.Throwable -> L44
            r0.e = r3     // Catch: java.lang.Throwable -> L44
            fhi r9 = r9.e     // Catch: java.lang.Throwable -> L44
            fhv r3 = new fhv     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r9 = r9.b(r3, r0)     // Catch: java.lang.Throwable -> L44
            if (r9 == r1) goto L93
            agpu r9 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L44
        L93:
            if (r9 != r1) goto L96
            goto La4
        L96:
            r8.d()
            agpu r8 = defpackage.agpu.a
            return r8
        L9c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        La0:
            r8.d()
            throw r9
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fab.c(fmy, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ezx
            if (r0 == 0) goto L13
            r0 = r7
            ezx r0 = (defpackage.ezx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ezx r0 = new ezx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.agpl.b(r7)
            goto L46
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            defpackage.agpl.b(r7)
            zyd r7 = r6.f()
            agte r2 = r6.k
            ezy r5 = new ezy
            r5.<init>(r7, r3)
            r0.c = r4
            java.lang.Object r7 = defpackage.ahal.a(r2, r5, r0)
            if (r7 == r1) goto Laf
        L46:
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto Lae
            com.google.protobuf.ExtensionRegistryLite r0 = com.google.protobuf.ExtensionRegistryLite.getGeneratedRegistry()     // Catch: defpackage.abxv -> L8e
            abuy r1 = defpackage.abuy.a     // Catch: defpackage.abxv -> L8e
            int r2 = r7.length     // Catch: defpackage.abxv -> L8e
            r5 = 0
            abxd r7 = defpackage.abxd.h(r1, r7, r5, r2, r0)     // Catch: defpackage.abxv -> L8e
            if (r7 == 0) goto L8b
            java.lang.Object r0 = r7.cM(r4, r3)     // Catch: defpackage.abxv -> L8e
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch: defpackage.abxv -> L8e
            byte r0 = r0.byteValue()     // Catch: defpackage.abxv -> L8e
            if (r0 != r4) goto L65
            goto L8b
        L65:
            if (r0 == 0) goto L81
            abza r0 = defpackage.abza.a     // Catch: defpackage.abxv -> L8e
            java.lang.Class r1 = r7.getClass()     // Catch: defpackage.abxv -> L8e
            abzj r0 = r0.a(r1)     // Catch: defpackage.abxv -> L8e
            boolean r0 = r0.l(r7)     // Catch: defpackage.abxv -> L8e
            if (r4 == r0) goto L79
            r1 = r3
            goto L7a
        L79:
            r1 = r7
        L7a:
            r2 = 2
            r7.cM(r2, r1)     // Catch: defpackage.abxv -> L8e
            if (r0 == 0) goto L81
            goto L8b
        L81:
            abzz r7 = new abzz     // Catch: defpackage.abxv -> L8e
            r7.<init>()     // Catch: defpackage.abxv -> L8e
            abxv r7 = r7.a()     // Catch: defpackage.abxv -> L8e
            throw r7     // Catch: defpackage.abxv -> L8e
        L8b:
            abuy r7 = (defpackage.abuy) r7     // Catch: defpackage.abxv -> L8e
            return r7
        L8e:
            r7 = move-exception
            zdy r0 = defpackage.fab.a
            zeo r0 = r0.d()
            zdv r0 = (defpackage.zdv) r0
            zeo r7 = r0.p(r7)
            r0 = 212(0xd4, float:2.97E-43)
            java.lang.String r1 = "AtvAssistantParamsBuilder.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder"
            java.lang.String r4 = "queryLauncherConfigData"
            zeo r7 = r7.q(r2, r4, r0, r1)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r0 = "Failed to parse launcherConfigData."
            r7.u(r0)
        Lae:
            return r3
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fab.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ezz
            if (r0 == 0) goto L13
            r0 = r9
            ezz r0 = (defpackage.ezz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ezz r0 = new ezz
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.agpl.b(r9)     // Catch: defpackage.vsq -> L29
            goto L58
        L29:
            r9 = move-exception
            goto L7e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            defpackage.agpl.b(r9)
            vrs r9 = r8.j     // Catch: defpackage.vsq -> L29
            android.net.Uri r2 = defpackage.esx.a     // Catch: defpackage.vsq -> L29
            r2.getClass()     // Catch: defpackage.vsq -> L29
            yyk r6 = defpackage.esx.b     // Catch: defpackage.vsq -> L29
            r6.getClass()     // Catch: defpackage.vsq -> L29
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: defpackage.vsq -> L29
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch: defpackage.vsq -> L29
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: defpackage.vsq -> L29
            faa r7 = new faa     // Catch: defpackage.vsq -> L29
            r7.<init>()     // Catch: defpackage.vsq -> L29
            r0.c = r4     // Catch: defpackage.vsq -> L29
            java.lang.Object r9 = r9.c(r2, r6, r7, r0)     // Catch: defpackage.vsq -> L29
            if (r9 != r1) goto L58
            return r1
        L58:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: defpackage.vsq -> L29
            java.util.Iterator r9 = r9.iterator()     // Catch: defpackage.vsq -> L29
            r0 = r5
        L5f:
            boolean r1 = r9.hasNext()     // Catch: defpackage.vsq -> L29
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r9.next()     // Catch: defpackage.vsq -> L29
            r2 = r1
            ezs r2 = (defpackage.ezs) r2     // Catch: defpackage.vsq -> L29
            abuy r6 = r2.a     // Catch: defpackage.vsq -> L29
            if (r6 != 0) goto L74
            xcj r2 = r2.b     // Catch: defpackage.vsq -> L29
            if (r2 == 0) goto L5f
        L74:
            if (r3 == 0) goto L77
            return r5
        L77:
            r0 = r1
            r3 = r4
            goto L5f
        L7a:
            if (r3 != 0) goto L7d
            return r5
        L7d:
            return r0
        L7e:
            zdy r0 = defpackage.fab.a
            zeo r0 = r0.d()
            zdv r0 = (defpackage.zdv) r0
            zeo r9 = r0.p(r9)
            r0 = 287(0x11f, float:4.02E-43)
            java.lang.String r1 = "AtvAssistantParamsBuilder.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder"
            java.lang.String r3 = "queryLauncherXConfigContentProvider"
            zeo r9 = r9.q(r2, r3, r0, r1)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r0 = "Launcher content provider query failed."
            r9.u(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fab.e(agsw):java.lang.Object");
    }
}
