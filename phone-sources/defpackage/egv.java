package defpackage;

import android.os.ConditionVariable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egv extends Thread {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ egw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egv(egw egwVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = conditionVariable;
        this.b = egwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long jAbs;
        egq egqVar;
        egw egwVar = this.b;
        synchronized (egwVar) {
            this.a.open();
            File file = egwVar.a;
            if (!file.exists()) {
                try {
                    egw.o(file);
                } catch (egb e) {
                    egwVar.e = e;
                }
            }
            File file2 = egwVar.a;
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles == null) {
                String strConcat = "Failed to list cache directory files: ".concat(String.valueOf(String.valueOf(file2)));
                edb.c("SimpleCache", strConcat);
                egwVar.e = new egb(strConcat);
            } else {
                int length = fileArrListFiles.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        jAbs = -1;
                        break;
                    }
                    File file3 = fileArrListFiles[i2];
                    String name = file3.getName();
                    if (name.endsWith(".uid")) {
                        try {
                            jAbs = Long.parseLong(name.substring(i, name.indexOf(46)), 16);
                            break;
                        } catch (NumberFormatException unused) {
                            edb.c("SimpleCache", "Malformed UID file: ".concat(String.valueOf(String.valueOf(file3))));
                            file3.delete();
                        }
                    }
                    i2++;
                }
                egwVar.d = jAbs;
                if (jAbs == -1) {
                    try {
                        File file4 = egwVar.a;
                        long jNextLong = new SecureRandom().nextLong();
                        jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                        File file5 = new File(file4, String.valueOf(Long.toString(jAbs, 16)).concat(".uid"));
                        if (!file5.createNewFile()) {
                            throw new IOException("Failed to create UID file: ".concat(file5.toString()));
                        }
                        egwVar.d = jAbs;
                    } catch (IOException e2) {
                        String strConcat2 = "Failed to create cache UID: ".concat(String.valueOf(String.valueOf(egwVar.a)));
                        edb.d("SimpleCache", strConcat2, e2);
                        egwVar.e = new egb(strConcat2, e2);
                    }
                }
                try {
                    egr egrVar = egwVar.b;
                    egq egqVar2 = egrVar.c;
                    egqVar2.b(jAbs);
                    egq egqVar3 = egrVar.d;
                    if (egqVar3 != null) {
                        egqVar3.b(jAbs);
                    }
                    if (egqVar2.h() || (egqVar = egrVar.d) == null || !egqVar.h()) {
                        egqVar2.c(egrVar.a, egrVar.b);
                    } else {
                        egq egqVar4 = egrVar.d;
                        HashMap map = egrVar.a;
                        egqVar4.c(map, egrVar.b);
                        egqVar2.f(map);
                    }
                    egq egqVar5 = egrVar.d;
                    if (egqVar5 != null) {
                        egqVar5.a();
                        egrVar.d = null;
                    }
                    egi egiVar = egwVar.c;
                    if (egiVar != null) {
                        egiVar.b(egwVar.d);
                        Map mapA = egiVar.a();
                        egwVar.p(egwVar.a, true, fileArrListFiles, mapA);
                        egiVar.d(mapA.keySet());
                    } else {
                        egwVar.p(egwVar.a, true, fileArrListFiles, null);
                    }
                    egr egrVar2 = egwVar.b;
                    UnmodifiableIterator it = ImmutableSet.copyOf((Collection) egrVar2.a.keySet()).iterator();
                    while (it.hasNext()) {
                        egrVar2.d((String) it.next());
                    }
                    try {
                        egrVar2.e();
                    } catch (IOException e3) {
                        edb.d("SimpleCache", "Storing index file failed", e3);
                    }
                } catch (IOException e4) {
                    String strConcat3 = "Failed to initialize cache indices: ".concat(String.valueOf(String.valueOf(egwVar.a)));
                    edb.d("SimpleCache", strConcat3, e4);
                    egwVar.e = new egb(strConcat3, e4);
                }
            }
        }
    }
}
