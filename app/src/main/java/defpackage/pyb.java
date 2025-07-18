package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.nio.channels.DesugarChannels;
import j$.time.Instant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyb implements prk {
    public final Executor a;
    private final Context b;
    private final pkn c;
    private final yqt d;
    private final pmq e;

    public pyb(Context context, pmq pmqVar, pkn pknVar, yqt yqtVar, Executor executor) {
        this.b = context;
        this.e = pmqVar;
        this.c = pknVar;
        this.d = yqtVar;
        this.a = executor;
    }

    @Override // defpackage.prk
    public final zyd a(pia piaVar) {
        int i = qce.a;
        pia piaVarD = qeg.d(piaVar, (Instant.now().toEpochMilli() / 1000) + piaVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(piaVarD);
        return m(arrayList);
    }

    @Override // defpackage.prk
    public final zyd b() {
        Context context = this.b;
        yqt yqtVar = this.d;
        qer.a(context, "gms_icing_mdd_groups", yqtVar).edit().clear().commit();
        qer.a(context, "gms_icing_mdd_group_key_properties", yqtVar).edit().clear().commit();
        return k();
    }

    @Override // defpackage.prk
    public final zyd c() {
        return zuz.h(d(), wyo.c(new zvi() { // from class: pya
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    pyb pybVar = this.a;
                    if (!it.hasNext()) {
                        return qft.a(arrayList).b(new zvh() { // from class: pxz
                            @Override // defpackage.zvh
                            public final zyd a() {
                                ArrayList arrayList2 = new ArrayList();
                                int i = 0;
                                while (true) {
                                    List list2 = list;
                                    if (i >= list2.size()) {
                                        return zxn.h(arrayList2);
                                    }
                                    List list3 = arrayList;
                                    piy piyVar = (piy) list2.get(i);
                                    pia piaVar = (pia) zxn.o((Future) list3.get(i));
                                    if (piaVar != null) {
                                        arrayList2.add(new pyh(piyVar, piaVar));
                                    }
                                    i++;
                                }
                            }
                        }, pybVar.a);
                    }
                    arrayList.add(pybVar.g((piy) it.next()));
                }
            }
        }), this.a);
    }

    @Override // defpackage.prk
    public final zyd d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferencesA = qer.a(this.b, "gms_icing_mdd_groups", this.d);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesA.getAll().keySet()) {
            try {
                arrayList.add(qei.a(str));
            } catch (qeh e) {
                qce.f(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                this.c.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesA.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return zxn.h(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    @Override // defpackage.prk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd e() throws java.io.IOException {
        /*
            r9 = this;
            android.content.Context r0 = r9.b
            yqt r1 = r9.d
            java.io.File r0 = defpackage.qei.b(r0, r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L76
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L76
            r2 = 0
            r3 = 1
            long r4 = r0.length()     // Catch: java.lang.IllegalArgumentException -> L65
            int r0 = (int) r4     // Catch: java.lang.IllegalArgumentException -> L65
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.IllegalArgumentException -> L65
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch: java.io.IOException -> L4e
            java.nio.channels.FileChannel r4 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r4)     // Catch: java.io.IOException -> L4e
            r4.read(r0)     // Catch: java.io.IOException -> L4e
            r0.rewind()     // Catch: java.io.IOException -> L4e
            java.lang.Class<pia> r4 = defpackage.pia.class
            pia r5 = defpackage.pia.a     // Catch: java.io.IOException -> L4e
            abyy r5 = defpackage.pia.b     // Catch: java.io.IOException -> L4e
            if (r5 != 0) goto L44
            java.lang.Class<pia> r5 = defpackage.pia.class
            monitor-enter(r5)     // Catch: java.io.IOException -> L4e
            abyy r6 = defpackage.pia.b     // Catch: java.lang.Throwable -> L41
            if (r6 != 0) goto L3e
            abwx r6 = new abwx     // Catch: java.lang.Throwable -> L41
            pia r7 = defpackage.pia.a     // Catch: java.lang.Throwable -> L41
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
            defpackage.pia.b = r6     // Catch: java.lang.Throwable -> L41
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            r5 = r6
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.io.IOException -> L4e
        L44:
            java.util.List r0 = defpackage.qeo.b(r0, r4, r5)     // Catch: java.io.IOException -> L4e
            r1.close()     // Catch: java.io.IOException -> L4c
            goto L5e
        L4c:
            r1 = move-exception
            goto L53
        L4e:
            r0 = move-exception
            r1 = 0
            r8 = r1
            r1 = r0
            r0 = r8
        L53:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "FileGroupsMetadataUtil"
            r3[r2] = r4
            java.lang.String r2 = "%s: IOException occurred while reading file groups."
            defpackage.qce.g(r1, r2, r3)
        L5e:
            if (r0 != 0) goto L7f
            int r0 = defpackage.yyk.e
            yyk r0 = defpackage.zcg.b
            goto L7f
        L65:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = "FileGroupsMetadataUtil"
            r1[r2] = r3
            java.lang.String r2 = "%s: Exception while reading from stale groups into buffer."
            defpackage.qce.g(r0, r2, r1)
            int r0 = defpackage.yyk.e
            yyk r0 = defpackage.zcg.b
            goto L7f
        L76:
            r0.getAbsolutePath()
            int r0 = defpackage.qce.a
            int r0 = defpackage.yyk.e
            yyk r0 = defpackage.zcg.b
        L7f:
            zyd r0 = defpackage.zxn.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyb.e():zyd");
    }

    @Override // defpackage.prk
    public final zyd f() {
        return zxy.a;
    }

    @Override // defpackage.prk
    public final zyd g(piy piyVar) {
        Context context = this.b;
        String strC = qei.c(piyVar);
        SharedPreferences sharedPreferencesA = qer.a(context, "gms_icing_mdd_groups", this.d);
        pia piaVar = pia.a;
        abyy abwxVar = pia.b;
        if (abwxVar == null) {
            synchronized (pia.class) {
                abwxVar = pia.b;
                if (abwxVar == null) {
                    abwxVar = new abwx(pia.a);
                    pia.b = abwxVar;
                }
            }
        }
        return zxn.h((pia) qer.c(sharedPreferencesA, strC, abwxVar));
    }

    @Override // defpackage.prk
    public final zyd h(piy piyVar) {
        Context context = this.b;
        String strC = qei.c(piyVar);
        SharedPreferences sharedPreferencesA = qer.a(context, "gms_icing_mdd_group_key_properties", this.d);
        pja pjaVar = pja.a;
        abyy abwxVar = pja.b;
        if (abwxVar == null) {
            synchronized (pja.class) {
                abwxVar = pja.b;
                if (abwxVar == null) {
                    abwxVar = new abwx(pja.a);
                    pja.b = abwxVar;
                }
            }
        }
        return zxn.h((pja) qer.c(sharedPreferencesA, strC, abwxVar));
    }

    @Override // defpackage.prk
    public final zyd i(piy piyVar) {
        Context context = this.b;
        yqt yqtVar = this.d;
        return zxn.h(Boolean.valueOf(qer.g(qer.a(context, "gms_icing_mdd_groups", yqtVar), qei.c(piyVar))));
    }

    @Override // defpackage.prk
    public final zyd j(List list) {
        SharedPreferences.Editor editorEdit = qer.a(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            piy piyVar = (piy) it.next();
            String str = piyVar.d;
            String str2 = piyVar.e;
            int i = qce.a;
            editorEdit.remove(qer.e(piyVar));
        }
        return zxn.h(Boolean.valueOf(editorEdit.commit()));
    }

    @Override // defpackage.prk
    public final zyd k() {
        n().delete();
        return zxy.a;
    }

    @Override // defpackage.prk
    public final zyd l(piy piyVar, pia piaVar) {
        Context context = this.b;
        yqt yqtVar = this.d;
        return zxn.h(Boolean.valueOf(qer.h(qer.a(context, "gms_icing_mdd_groups", yqtVar), qei.c(piyVar), piaVar)));
    }

    @Override // defpackage.prk
    public final zyd m(List list) throws IOException {
        File fileN = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileN, true);
            try {
                ByteBuffer byteBufferA = qeo.a(list);
                if (byteBufferA != null) {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(byteBufferA);
                }
                fileOutputStream.close();
                return zxn.h(true);
            } catch (IOException unused) {
                qce.b("IOException occurred while writing file groups.");
                return zxn.h(false);
            }
        } catch (FileNotFoundException unused2) {
            qce.c("File %s not found while writing.", fileN.getAbsolutePath());
            return zxn.h(false);
        }
    }

    final File n() {
        return qei.b(this.b, this.d);
    }
}
