package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcb {
    public static final tvn a = tvn.n("GnpSdk");

    public static final qrd a(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE");
        if (byteArrayExtra != null) {
            try {
                vuc vucVarP = vuc.p(qrd.a, byteArrayExtra, 0, byteArrayExtra.length, vtp.a());
                vuc.B(vucVarP);
                qrd qrdVar = (qrd) vucVarP;
                qrdVar.getClass();
                return qrdVar;
            } catch (vuq e) {
                ((tvk) ((tvk) a.f()).i(e)).s("Unable to parse LocalThreadState message");
            }
        }
        qrd qrdVar2 = qrd.a;
        qrdVar2.getClass();
        return qrdVar2;
    }

    public static final vht b(Intent intent) {
        intent.getClass();
        vht vhtVarB = vht.b(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
        return vhtVarB == null ? vht.REMOVE_REASON_UNKNOWN : vhtVarB;
    }

    public static final vks c(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION");
        if (byteArrayExtra != null) {
            try {
                vuc vucVarP = vuc.p(vks.a, byteArrayExtra, 0, byteArrayExtra.length, vtp.a());
                vuc.B(vucVarP);
                vks vksVar = (vks) vucVarP;
                vksVar.getClass();
                return vksVar;
            } catch (vuq e) {
                ((tvk) ((tvk) a.f()).i(e)).s("Unable to parse Action message");
            }
        }
        vks vksVar2 = vks.a;
        vksVar2.getClass();
        return vksVar2;
    }

    public static final vmo d(Intent intent) {
        intent.getClass();
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                vuc vucVarP = vuc.p(vmo.a, byteArrayExtra, 0, byteArrayExtra.length, vtp.a());
                vuc.B(vucVarP);
                vmo vmoVar = (vmo) vucVarP;
                vmoVar.getClass();
                return vmoVar;
            } catch (vuq e) {
                ((tvk) ((tvk) a.f()).i(e)).s("Unable to parse ThreadStateUpdate message");
            }
        }
        vmo vmoVar2 = vmo.a;
        vmoVar2.getClass();
        return vmoVar2;
    }

    public static final String e(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
    }

    public static final String f(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
    }

    public static final String g(Intent intent) {
        intent.getClass();
        return intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
    }

    public static final void h(Intent intent, qen qenVar) {
        intent.getClass();
        if (qenVar == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", osk.O(qenVar.b()));
    }

    public static final void i(Intent intent, String str) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
    }

    public static final void j(Intent intent, Bundle bundle) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA", bundle);
    }

    public static final void k(Intent intent, int i) {
        intent.getClass();
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
    }

    public static final void l(Intent intent, qis qisVar) {
        intent.getClass();
        if (qisVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", qisVar.n);
        }
    }

    public static final void m(Intent intent, qrd qrdVar) {
        intent.getClass();
        if (qrdVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", qrdVar.h());
        }
    }

    public static final void n(Intent intent, vht vhtVar) {
        intent.getClass();
        vhtVar.getClass();
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", vhtVar.n);
    }

    public static final void o(Intent intent, qis qisVar) {
        intent.getClass();
        if (qisVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", qisVar.a);
        }
    }

    public static final void p(Intent intent, vmo vmoVar) {
        intent.getClass();
        if (vmoVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", vmoVar.h());
        }
    }

    public static final int q(Intent intent) {
        intent.getClass();
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }
}
