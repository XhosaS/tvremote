package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
class kzy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ lab f;

    public kzy(lab labVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = labVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lab labVar = this.f;
        lbk lbkVar = labVar.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        if (!laoVar.r()) {
            Log.println(6, this.f.f(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (labVar.a == 0) {
            ktx ktxVar = labVar.y.d;
            if (ktxVar.c == null) {
                synchronized (ktxVar) {
                    if (ktxVar.c == null) {
                        lbk lbkVar2 = ktxVar.y;
                        ApplicationInfo applicationInfo = lbkVar2.a.getApplicationInfo();
                        String strA = klq.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            ktxVar.c = Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (ktxVar.c == null) {
                            ktxVar.c = Boolean.TRUE;
                            lab labVar2 = lbkVar2.f;
                            lbkVar2.o(labVar2);
                            labVar2.c.a("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (ktxVar.c.booleanValue()) {
                lab labVar3 = this.f;
                kts ktsVar = labVar3.y.c;
                labVar3.a = 'C';
            } else {
                lab labVar4 = this.f;
                kts ktsVar2 = labVar4.y.c;
                labVar4.a = 'c';
            }
        }
        lab labVar5 = this.f;
        if (labVar5.b < 0) {
            kts ktsVar3 = labVar5.y.d.y.c;
            labVar5.b = 129017L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.a);
        char c = labVar5.a;
        long j = labVar5.b;
        String str2 = this.b;
        String strSubstring = "2" + cCharAt + c + j + ":" + lab.c(true, str2, this.c, this.d, this.e);
        if (strSubstring.length() > 1024) {
            strSubstring = str2.substring(0, 1024);
        }
        lam lamVar = laoVar.c;
        if (lamVar != null) {
            lao laoVar2 = lamVar.e;
            laoVar2.g();
            if (lamVar.a() == 0) {
                lamVar.b();
            }
            if (strSubstring == null) {
                strSubstring = "";
            }
            SharedPreferences sharedPreferencesC = laoVar2.c();
            String str3 = lamVar.b;
            long j2 = sharedPreferencesC.getLong(str3, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = laoVar2.c().edit();
                editorEdit.putString(lamVar.c, strSubstring);
                editorEdit.putLong(str3, 1L);
                editorEdit.apply();
                return;
            }
            lbk lbkVar3 = laoVar2.y;
            lio lioVar = lbkVar3.i;
            lbkVar3.m(lioVar);
            long jNextLong = lioVar.F().nextLong() & Long.MAX_VALUE;
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = laoVar2.c().edit();
            if (jNextLong < j4) {
                editorEdit2.putString(lamVar.c, strSubstring);
            }
            editorEdit2.putLong(str3, j3);
            editorEdit2.apply();
        }
    }
}
