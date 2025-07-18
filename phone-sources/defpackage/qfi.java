package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfi {
    public final qfh a;
    public final qfh b;
    public final Integer c;
    public final String d;
    public final byte[] e;
    public final String f;
    public final int g;
    private final String h;
    private final String i;

    public qfi() {
        throw null;
    }

    public static qfi a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        String stringExtra = intent.getStringExtra("casp");
        String stringExtra2 = intent.getStringExtra("chm");
        qfh qfhVarE = e(intent.getStringExtra("google.original_priority"));
        qfh qfhVarE2 = e(intent.getStringExtra("google.delivered_priority"));
        int iD = d(intent.getStringExtra("message_type"));
        String stringExtra3 = intent.getStringExtra("ki");
        Integer numValueOf = !intent.hasExtra("google.ttl") ? null : Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        Integer num = numValueOf == null ? null : numValueOf;
        String stringExtra4 = intent.getStringExtra("google.message_id");
        return new qfi(true != TextUtils.isEmpty(stringExtra4) ? stringExtra4 : null, iD, qfhVarE, qfhVarE2, num, stringExtra, byteArrayExtra, stringExtra2, stringExtra3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.lang.String r2) {
        /*
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.hashCode()
            switch(r1) {
                case -2062414158: goto L2a;
                case 102161: goto L20;
                case 814694033: goto L16;
                case 814800675: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L34
        Lc:
            java.lang.String r1 = "send_event"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            r2 = 4
            return r2
        L16:
            java.lang.String r1 = "send_error"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            r2 = 5
            return r2
        L20:
            java.lang.String r1 = "gcm"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            r2 = 2
            return r2
        L2a:
            java.lang.String r1 = "deleted_messages"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L34
            r2 = 3
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfi.d(java.lang.String):int");
    }

    private static qfh e(String str) {
        if (str == null) {
            return qfh.PRIORITY_UNKNOWN;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1039745817) {
            if (iHashCode == 3202466 && str.equals("high")) {
                return qfh.PRIORITY_HIGH;
            }
        } else if (str.equals("normal")) {
            return qfh.PRIORITY_NORMAL;
        }
        return qfh.PRIORITY_UNKNOWN;
    }

    private static int f(qfh qfhVar) {
        if (qfhVar == null) {
            return 1;
        }
        int iOrdinal = qfhVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vhi b() {
        /*
            r7 = this;
            vhi r0 = defpackage.vhi.a
            vtw r0 = r0.m()
            qfh r1 = r7.a
            int r1 = f(r1)
            vuc r2 = r0.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L17
            r0.u()
        L17:
            vuc r2 = r0.b
            vhi r2 = (defpackage.vhi) r2
            int r1 = r1 + (-1)
            r2.e = r1
            int r1 = r2.b
            r3 = 4
            r1 = r1 | r3
            r2.b = r1
            qfh r1 = r7.b
            int r1 = f(r1)
            vuc r2 = r0.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L36
            r0.u()
        L36:
            vuc r2 = r0.b
            r4 = r2
            vhi r4 = (defpackage.vhi) r4
            int r1 = r1 + (-1)
            r4.f = r1
            int r1 = r4.b
            r1 = r1 | 8
            r4.b = r1
            int r1 = r7.g
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L4d
        L4b:
            r3 = r5
            goto L5e
        L4d:
            int r1 = r1 + (-1)
            if (r1 == r5) goto L5d
            r6 = 3
            if (r1 == r4) goto L5b
            if (r1 == r6) goto L5e
            if (r1 == r3) goto L59
            goto L4b
        L59:
            r3 = 5
            goto L5e
        L5b:
            r3 = r6
            goto L5e
        L5d:
            r3 = r4
        L5e:
            boolean r1 = r2.A()
            if (r1 != 0) goto L67
            r0.u()
        L67:
            vuc r1 = r0.b
            vhi r1 = (defpackage.vhi) r1
            int r3 = r3 + (-1)
            r1.d = r3
            int r2 = r1.b
            r2 = r2 | r4
            r1.b = r2
            java.lang.String r1 = r7.h
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L95
            vuc r2 = r0.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L87
            r0.u()
        L87:
            vuc r2 = r0.b
            vhi r2 = (defpackage.vhi) r2
            r1.getClass()
            int r3 = r2.b
            r3 = r3 | r5
            r2.b = r3
            r2.c = r1
        L95:
            vuc r0 = r0.r()
            vhi r0 = (defpackage.vhi) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfi.b():vhi");
    }

    public final boolean c() {
        String str;
        String str2 = this.d;
        if (str2 == null || str2.length() == 0) {
            return (this.e == null || (str = this.i) == null || str.length() == 0) ? false : true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfi) {
            qfi qfiVar = (qfi) obj;
            String str2 = this.h;
            if (str2 != null ? str2.equals(qfiVar.h) : qfiVar.h == null) {
                int i = this.g;
                if (i != 0 ? i == qfiVar.g : qfiVar.g == 0) {
                    qfh qfhVar = this.a;
                    if (qfhVar != null ? qfhVar.equals(qfiVar.a) : qfiVar.a == null) {
                        qfh qfhVar2 = this.b;
                        if (qfhVar2 != null ? qfhVar2.equals(qfiVar.b) : qfiVar.b == null) {
                            Integer num = this.c;
                            if (num != null ? num.equals(qfiVar.c) : qfiVar.c == null) {
                                String str3 = this.d;
                                if (str3 != null ? str3.equals(qfiVar.d) : qfiVar.d == null) {
                                    if (Arrays.equals(this.e, qfiVar instanceof qfi ? qfiVar.e : qfiVar.e) && ((str = this.i) != null ? str.equals(qfiVar.i) : qfiVar.i == null)) {
                                        String str4 = this.f;
                                        String str5 = qfiVar.f;
                                        if (str4 != null ? str4.equals(str5) : str5 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.h;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        if (i == 0) {
            i = 0;
        } else {
            a.bl(i);
        }
        int i2 = iHashCode ^ 1000003;
        qfh qfhVar = this.a;
        int iHashCode2 = ((((i2 * 1000003) ^ i) * 1000003) ^ (qfhVar == null ? 0 : qfhVar.hashCode())) * 1000003;
        qfh qfhVar2 = this.b;
        int iHashCode3 = (iHashCode2 ^ (qfhVar2 == null ? 0 : qfhVar2.hashCode())) * 1000003;
        Integer num = this.c;
        int iHashCode4 = (iHashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode5 = (((iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str3 = this.i;
        int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode6 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        String str2 = this.h;
        qfh qfhVar = this.a;
        qfh qfhVar2 = this.b;
        Integer num = this.c;
        String str3 = this.d;
        byte[] bArr = this.e;
        String str4 = this.i;
        String str5 = this.f;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + String.valueOf(qfhVar) + ", priorityDelivered=" + String.valueOf(qfhVar2) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + "}";
    }

    public qfi(String str, int i, qfh qfhVar, qfh qfhVar2, Integer num, String str2, byte[] bArr, String str3, String str4) {
        this.h = str;
        this.g = i;
        this.a = qfhVar;
        this.b = qfhVar2;
        this.c = num;
        this.d = str2;
        this.e = bArr;
        this.i = str3;
        this.f = str4;
    }
}
