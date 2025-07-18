package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.acm;
import defpackage.ant;
import defpackage.awe;
import defpackage.awy;
import defpackage.bdq;
import defpackage.cja;
import defpackage.qm;
import defpackage.qs;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppDoctorReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a(cja cjaVar, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                cjaVar.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        awy awyVar = new awy((byte[]) null, (byte[]) null);
        int i = 1;
        bdq.k(true, "AppDoctorLogger must be set");
        final ant antVar = new ant(awyVar);
        final acm acmVar = acm.TELEDOCTOR;
        cja cjaVarK = !qs.i(context) ? qm.K(false) : qs.h(new Callable() { // from class: ans
            /* JADX WARN: Code restructure failed: missing block: B:100:0x0279, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x027b, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0282, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0283, code lost:
            
                r19 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x0288, code lost:
            
                r19 = r6;
                r20 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x028c, code lost:
            
                if (r12 != false) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x0290, code lost:
            
                r0 = defpackage.qm.K(null);
                r1 = r8.b(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x0299, code lost:
            
                r1 = new defpackage.aoe();
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
            
                r0 = defpackage.qs.h(java.util.concurrent.Executors.callable(new defpackage.rj(r8, r20, (java.util.List) r10, r11, 4)));
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x02b2, code lost:
            
                if (r1.b() == false) goto L168;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x02b4, code lost:
            
                r1.a(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x02b8, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
            
                r9 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x02bb, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x02bc, code lost:
            
                r9 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x02c3, code lost:
            
                r19 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x02c7, code lost:
            
                r0 = defpackage.qm.K(null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x02cf, code lost:
            
                if (r9.b() == false) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x02d1, code lost:
            
                r9.a(r11.b);
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x02d6, code lost:
            
                r13 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x02d8, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0305, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:149:0x030e, code lost:
            
                if (r9.b() != false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:150:0x0310, code lost:
            
                r9.a(r11.b);
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x0315, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01ed, code lost:
            
                r3 = r11.b;
                r7 = new defpackage.awy(r3, (byte[]) null);
                r0 = r0.iterator();
                r12 = false;
                r13 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
            
                if (r0.hasNext() == false) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0201, code lost:
            
                r14 = (defpackage.aob) r0.next();
                r15 = new defpackage.aoc(r11);
                r15.g = r14;
                r15 = r15.a();
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0216, code lost:
            
                if (r14.a(r15) != false) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
            
                r14 = defpackage.qm.K(defpackage.aoa.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x021e, code lost:
            
                r18 = r0;
                r19 = r6;
                r20 = r9;
                r0 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0226, code lost:
            
                r18 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0228, code lost:
            
                r0 = new defpackage.aoc(r15);
                r1 = r14.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0231, code lost:
            
                r19 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0235, code lost:
            
                r20 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x0238, code lost:
            
                r0.b(new defpackage.any(r1.a, 3));
                r0 = r0.a();
                r14.c(r0, r1, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0247, code lost:
            
                if (r14.d == false) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0249, code lost:
            
                r0 = defpackage.qs.h(new defpackage.anz(r14, r0, r7));
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0253, code lost:
            
                r0 = defpackage.qm.K(r14.b(r0, r7, r1));
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x025b, code lost:
            
                r14 = r0;
                r0 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x025e, code lost:
            
                r13 = r13 | r0;
                r12 = r12 | (!r14.isDone());
                r10.add(r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0269, code lost:
            
                r0 = r18;
                r6 = r19;
                r9 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0272, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0273, code lost:
            
                r9 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x0277, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Removed duplicated region for block: B:136:0x02ed A[Catch: all -> 0x0316, TRY_LEAVE, TryCatch #9 {all -> 0x0316, blocks: (B:134:0x02e7, B:136:0x02ed, B:138:0x02f4, B:141:0x02fc, B:148:0x030a, B:150:0x0310, B:151:0x0315, B:114:0x02ae, B:116:0x02b4, B:125:0x02cb, B:127:0x02d1), top: B:180:0x01c3, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0310 A[Catch: all -> 0x0316, TryCatch #9 {all -> 0x0316, blocks: (B:134:0x02e7, B:136:0x02ed, B:138:0x02f4, B:141:0x02fc, B:148:0x030a, B:150:0x0310, B:151:0x0315, B:114:0x02ae, B:116:0x02b4, B:125:0x02cb, B:127:0x02d1), top: B:180:0x01c3, inners: #1 }] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.util.List] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 816
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ans.call():java.lang.Object");
            }
        });
        setResultCode(-1);
        if (cjaVarK.isDone()) {
            Log.i("AppDoctorReceiver", "Fix has already been completed.");
        } else {
            qs.h(new awe(cjaVarK, goAsync(), i));
        }
    }
}
