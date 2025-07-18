package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtj {
    public final qso a;
    private final Context b;

    public qtj(qso qsoVar, Context context) {
        this.a = qsoVar;
        this.b = context;
    }

    public final ahua a() {
        final qtk qtkVarA = qth.a(this.b, "getAndroidProcessStats");
        return b(this.a.a(new yrp() { // from class: qti
            @Override // defpackage.yrp
            public final Object eV() {
                return qtkVarA;
            }
        }), qtkVarA);
    }

    public final ahua b(boolean z, qtk qtkVar) {
        yqt yqtVarB;
        ahua ahuaVar = ahua.a;
        ahtz ahtzVar = new ahtz();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if ((ahtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtzVar.y();
        }
        ahua ahuaVar2 = (ahua) ahtzVar.b;
        ahuaVar2.b |= 1;
        ahuaVar2.c = elapsedCpuTime;
        if ((ahtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtzVar.y();
        }
        ahua ahuaVar3 = (ahua) ahtzVar.b;
        ahuaVar3.b |= 2;
        ahuaVar3.d = z;
        int iActiveCount = Thread.activeCount();
        if ((ahtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahtzVar.y();
        }
        ahua ahuaVar4 = (ahua) ahtzVar.b;
        ahuaVar4.b |= 4;
        ahuaVar4.e = iActiveCount;
        final int iMyPid = Process.myPid();
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(iMyPid));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    yqtVarB = yqt.h(randomAccessFile.readLine()).b(new yqi() { // from class: qzs
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            return Integer.valueOf(Integer.parseInt((String) obj));
                        }
                    });
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                yqtVarB = ypv.a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (yqtVarB.g()) {
                int iIntValue = ((Integer) yqtVarB.c()).intValue();
                if ((ahtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtzVar.y();
                }
                ahua ahuaVar5 = (ahua) ahtzVar.b;
                ahuaVar5.b |= 16;
                ahuaVar5.g = iIntValue;
            }
            yqt yqtVar = !qtkVar.b() ? ypv.a : (yqt) zag.b(qtkVar.c(), new yqx() { // from class: qtf
                @Override // defpackage.yqx
                public final boolean a(Object obj) {
                    return ((ActivityManager.RunningAppProcessInfo) obj).pid == iMyPid;
                }
            }).b(new yqi() { // from class: qtg
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return yqt.h(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
                }
            }).e(ypv.a);
            if (yqtVar.g()) {
                String strFlattenToString = ((ComponentName) yqtVar.c()).flattenToString();
                if ((ahtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtzVar.y();
                }
                ahua ahuaVar6 = (ahua) ahtzVar.b;
                strFlattenToString.getClass();
                ahuaVar6.b |= 32;
                ahuaVar6.h = strFlattenToString;
            }
            return (ahua) ahtzVar.v();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }
}
