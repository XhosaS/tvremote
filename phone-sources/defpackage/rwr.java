package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwr {
    private static volatile tst a;

    private rwr() {
    }

    public static tst a(Context context) {
        tst tstVar;
        tst tstVarI;
        tst tstVarI2;
        tst tstVar2 = a;
        if (tstVar2 != null) {
            return tstVar2;
        }
        synchronized (rwr.class) {
            tstVar = a;
            if (tstVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = rwt.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = osx.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                            tstVarI = file.exists() ? tst.i(file) : trk.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            tstVarI = trk.a;
                        }
                        if (tstVarI.g()) {
                            Object objC = tstVarI.c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objC)));
                                try {
                                    ko koVar = new ko();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", a.cr(line, "Invalid: "));
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            ko koVar2 = (ko) koVar.get(str3);
                                            if (koVar2 == null) {
                                                koVar2 = new ko();
                                                koVar.put(str3, koVar2);
                                            }
                                            koVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objC.toString() + " for Android package " + contextA.getPackageName());
                                    ulp ulpVar = new ulp(koVar, (byte[]) null);
                                    bufferedReader.close();
                                    tstVarI2 = tst.i(ulpVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            tstVarI2 = trk.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    tstVarI2 = trk.a;
                }
                tstVar = tstVarI2;
                a = tstVar;
            }
        }
        return tstVar;
    }
}
