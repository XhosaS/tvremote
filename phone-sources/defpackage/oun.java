package defpackage;

import android.media.MediaCodecInfo;
import android.support.v7.app.AppCompatDialogFragment;
import com.google.common.collect.ImmutableSet;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oun implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ oun(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        vsl vslVar;
        String strD;
        ArrayList arrayList;
        int i;
        switch (this.a) {
            case 0:
                int i2 = ouo.b;
                ((MediaCodecInfo.CodecProfileLevel) obj).getClass();
                return false;
            case 1:
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
                int i3 = ouo.b;
                codecProfileLevel.getClass();
                return Boolean.valueOf(codecProfileLevel.profile == 4096);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                tui tuiVar = ovv.a;
                entry.getClass();
                return Boolean.valueOf(ovv.b.contains(((otx) entry.getValue()).a));
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                vwe vweVar = ((uwe) entry2.getValue()).d;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                long millis = timeUnit.toMillis(vweVar.b);
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                vwe vweVar2 = ((uwe) entry2.getValue()).d;
                if (vweVar2 == null) {
                    vweVar2 = vwe.a;
                }
                return Boolean.valueOf(millis + timeUnit2.toMillis((long) vweVar2.c) < Instant.now().toEpochMilli());
            case 4:
                return DesugarCollections.unmodifiableMap(((pev) obj).b);
            case 5:
                ((cgz) obj).getClass();
                return ygi.a;
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                float f = ppd.a;
                float f2 = 0.0f;
                if (fFloatValue > 0.1f && fFloatValue < 0.95f) {
                    f2 = 1.0f;
                }
                return Float.valueOf(f2);
            case 7:
                cjg cjgVar = (cjg) obj;
                cjgVar.getClass();
                return "'" + cjgVar.a + "' " + cjgVar.b;
            case 8:
                ghiVarA = ((gic) obj).a("SELECT DISTINCT package_name FROM channels");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList2.add(ghiVarA.k(0) ? null : ghiVarA.d(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 9:
                return pwg.a;
            case 10:
                yfo yfoVar = (yfo) obj;
                int i4 = pwz.a;
                yfoVar.getClass();
                return yfoVar.b();
            case 11:
                qis qisVar = (qis) obj;
                qisVar.getClass();
                return qisVar.a;
            case 12:
                return ygi.a;
            case 13:
                tvn tvnVar = qku.a;
                ((Map) obj).getClass();
                return ygi.a;
            case 14:
                tvn tvnVar2 = qlc.a;
                ((Map) obj).getClass();
                return ygi.a;
            case 15:
                return ygi.a;
            case 16:
                ghiVarA = ((gic) obj).a("SELECT * FROM threads");
                try {
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "thread_id");
                    int iJ3 = gez.J(ghiVarA, "read_state");
                    int iJ4 = gez.J(ghiVarA, "deletion_status");
                    int iJ5 = gez.J(ghiVarA, "count_behavior");
                    int iJ6 = gez.J(ghiVarA, "system_tray_behavior");
                    int iJ7 = gez.J(ghiVarA, "last_updated_version");
                    int iJ8 = gez.J(ghiVarA, "last_notification_version");
                    int iJ9 = gez.J(ghiVarA, "creation_id");
                    int iJ10 = gez.J(ghiVarA, "payload_type");
                    int iJ11 = gez.J(ghiVarA, "payload");
                    int iJ12 = gez.J(ghiVarA, "insertion_time_ms");
                    int iJ13 = gez.J(ghiVarA, "storage_mode");
                    int iJ14 = gez.J(ghiVarA, "opaque_backend_data");
                    int iJ15 = gez.J(ghiVarA, "thread_type");
                    int iJ16 = gez.J(ghiVarA, "type_specific_data");
                    int iJ17 = gez.J(ghiVarA, "external_experiment_ids");
                    ArrayList arrayList3 = new ArrayList();
                    while (ghiVarA.l()) {
                        int i5 = iJ14;
                        ArrayList arrayList4 = arrayList3;
                        int iB = (int) ghiVarA.b(iJ);
                        String strD2 = ghiVarA.d(iJ2);
                        int i6 = iJ2;
                        int iB2 = vmb.b((int) ghiVarA.b(iJ3));
                        if (iB2 == 0) {
                            iB2 = vmb.a;
                        }
                        int i7 = iB2;
                        vll vllVarB = vll.b((int) ghiVarA.b(iJ4));
                        if (vllVarB == null) {
                            vllVarB = vll.DELETION_STATUS_UNKNOWN;
                        }
                        vll vllVar = vllVarB;
                        int iBm = a.bm((int) ghiVarA.b(iJ5));
                        int i8 = iBm == 0 ? 1 : iBm;
                        int iBm2 = a.bm((int) ghiVarA.b(iJ6));
                        int i9 = iBm2 == 0 ? 1 : iBm2;
                        long jB = ghiVarA.b(iJ7);
                        long jB2 = ghiVarA.b(iJ8);
                        long jB3 = ghiVarA.b(iJ9);
                        String strD3 = ghiVarA.k(iJ10) ? null : ghiVarA.d(iJ10);
                        byte[] bArrM = ghiVarA.k(iJ11) ? null : ghiVarA.m(iJ11);
                        if (bArrM == null) {
                            vslVar = null;
                        } else {
                            vsl vslVar2 = vsl.a;
                            vslVar2.getClass();
                            vvj vvjVarJ = vxr.j(bArrM, vslVar2);
                            vvjVarJ.getClass();
                            vslVar = (vsl) vvjVarJ;
                        }
                        long jB4 = ghiVarA.b(iJ12);
                        int iBm3 = a.bm((int) ghiVarA.b(iJ13));
                        int i10 = iBm3 == 0 ? 1 : iBm3;
                        vsz vszVarQ = vsz.q(ghiVarA.m(i5));
                        int i11 = iJ15;
                        int i12 = iJ3;
                        int iB3 = (int) ghiVarA.b(i11);
                        int i13 = iJ;
                        ygm ygmVar = new ygm((ygp) qlv.c);
                        Object obj2 = null;
                        boolean z = false;
                        while (ygmVar.hasNext()) {
                            Object next = ygmVar.next();
                            ygm ygmVar2 = ygmVar;
                            if (((qlv) next).d != iB3) {
                                ygmVar = ygmVar2;
                            } else {
                                if (z) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj2 = next;
                                ygmVar = ygmVar2;
                                z = true;
                            }
                        }
                        if (!z) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        int i14 = iJ16;
                        int i15 = iJ17;
                        iJ16 = i14;
                        arrayList4.add(new qlu(iB, strD2, i7, vllVar, i8, i9, jB, jB2, jB3, strD3, vslVar, jB4, i10, vszVarQ, (qlv) obj2, vsz.q(ghiVarA.m(i14)), ghiVarA.d(i15)));
                        iJ3 = i12;
                        iJ15 = i11;
                        iJ17 = i15;
                        arrayList3 = arrayList4;
                        iJ14 = i5;
                        iJ2 = i6;
                        iJ = i13;
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                ghiVarA = ((gic) obj).a("SELECT * FROM gnp_accounts");
                try {
                    int iJ18 = gez.J(ghiVarA, "id");
                    int iJ19 = gez.J(ghiVarA, "account_specific_id");
                    int iJ20 = gez.J(ghiVarA, "account_type");
                    int iJ21 = gez.J(ghiVarA, "obfuscated_gaia_id");
                    int iJ22 = gez.J(ghiVarA, "actual_account_name");
                    int iJ23 = gez.J(ghiVarA, "actual_account_oid");
                    int iJ24 = gez.J(ghiVarA, "registration_status");
                    int iJ25 = gez.J(ghiVarA, "registration_id");
                    int iJ26 = gez.J(ghiVarA, "sync_sources");
                    int iJ27 = gez.J(ghiVarA, "representative_target_id");
                    int iJ28 = gez.J(ghiVarA, "sync_version");
                    int iJ29 = gez.J(ghiVarA, "last_registration_time_ms");
                    int iJ30 = gez.J(ghiVarA, "last_registration_request_hash");
                    int iJ31 = gez.J(ghiVarA, "first_registration_version");
                    int iJ32 = gez.J(ghiVarA, "internal_target_id");
                    int iJ33 = gez.J(ghiVarA, "fitbit_decoded_id");
                    ArrayList arrayList5 = new ArrayList();
                    while (ghiVarA.l()) {
                        long jB5 = ghiVarA.b(iJ18);
                        if (ghiVarA.k(iJ19)) {
                            strD = null;
                            i = iJ18;
                            arrayList = arrayList5;
                        } else {
                            strD = ghiVarA.d(iJ19);
                            arrayList = arrayList5;
                            i = iJ18;
                        }
                        int iT = qtl.T((int) ghiVarA.b(iJ20));
                        String strD4 = ghiVarA.k(iJ21) ? null : ghiVarA.d(iJ21);
                        String strD5 = ghiVarA.k(iJ22) ? null : ghiVarA.d(iJ22);
                        String strD6 = ghiVarA.k(iJ23) ? null : ghiVarA.d(iJ23);
                        int iB4 = (int) ghiVarA.b(iJ24);
                        String strD7 = ghiVarA.k(iJ25) ? null : ghiVarA.d(iJ25);
                        ImmutableSet immutableSetR = qtl.R(ghiVarA.k(iJ26) ? null : ghiVarA.d(iJ26));
                        String strD8 = ghiVarA.k(iJ27) ? null : ghiVarA.d(iJ27);
                        long jB6 = ghiVarA.b(iJ28);
                        long jB7 = ghiVarA.b(iJ29);
                        int iB5 = (int) ghiVarA.b(iJ30);
                        long jB8 = ghiVarA.b(iJ31);
                        int i16 = iJ32;
                        String strD9 = ghiVarA.k(i16) ? null : ghiVarA.d(i16);
                        int i17 = iJ33;
                        iJ33 = i17;
                        iJ32 = i16;
                        arrayList5 = arrayList;
                        arrayList5.add(qen.d(jB5, strD, iT, strD4, strD5, strD6, iB4, strD7, immutableSetR, strD8, jB6, jB7, iB5, jB8, strD9, ghiVarA.b(i17)));
                        iJ18 = i;
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                return qtl.M(obj);
            case 19:
                AppCompatDialogFragment appCompatDialogFragment = (AppCompatDialogFragment) obj;
                appCompatDialogFragment.getClass();
                appCompatDialogFragment.dismiss();
                return ygi.a;
            default:
                ((vrn) obj).getClass();
                return null;
        }
    }
}
