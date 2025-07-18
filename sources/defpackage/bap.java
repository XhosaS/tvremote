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
/* loaded from: classes.dex */
public final class bap {
    private static volatile byg a;

    private bap() {
    }

    public static byg a(Context context) {
        byg bygVar;
        byg bygVarH;
        byg bygVarH2;
        byg bygVar2 = a;
        if (bygVar2 != null) {
            return bygVar2;
        }
        synchronized (bap.class) {
            bygVar = a;
            if (bygVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = bar.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = apr.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                            bygVarH = file.exists() ? byg.h(file) : bxw.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            bygVarH = bxw.a;
                        }
                        if (bygVarH.f()) {
                            Object objB = bygVarH.b();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objB)));
                                try {
                                    mi miVar = new mi();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", b.g(line, "Invalid: "));
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
                                            mi miVar2 = (mi) miVar.get(str3);
                                            if (miVar2 == null) {
                                                miVar2 = new mi();
                                                miVar.put(str3, miVar2);
                                            }
                                            miVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objB.toString() + " for Android package " + contextA.getPackageName());
                                    att attVar = new att(miVar);
                                    bufferedReader.close();
                                    bygVarH2 = byg.h(attVar);
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
                            bygVarH2 = bxw.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    bygVarH2 = bxw.a;
                }
                bygVar = bygVarH2;
                a = bygVar;
            }
        }
        return bygVar;
    }
}
