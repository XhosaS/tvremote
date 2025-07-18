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
public class rfd {
    private static volatile yqt a;

    private rfd() {
    }

    public static yqt a(Context context) {
        yqt yqtVar;
        yqt yqtVarI;
        yqt yqtVarI2;
        yqt yqtVar2 = a;
        if (yqtVar2 != null) {
            return yqtVar2;
        }
        synchronized (rfd.class) {
            yqtVar = a;
            if (yqtVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = rff.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextA = mhv.a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                            yqtVarI = file.exists() ? yqt.i(file) : ypv.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            yqtVarI = ypv.a;
                        }
                        if (yqtVarI.g()) {
                            Object objC = yqtVarI.c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objC)));
                                try {
                                    wx wxVar = new wx(0);
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", a.j(line, "Invalid: "));
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
                                            wx wxVar2 = (wx) wxVar.get(str3);
                                            if (wxVar2 == null) {
                                                wxVar2 = new wx(0);
                                                wxVar.put(str3, wxVar2);
                                            }
                                            wxVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objC.toString() + " for Android package " + contextA.getPackageName());
                                    rew rewVar = new rew(wxVar);
                                    bufferedReader.close();
                                    yqtVarI2 = yqt.i(rewVar);
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
                            yqtVarI2 = ypv.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    yqtVarI2 = ypv.a;
                }
                yqtVar = yqtVarI2;
                a = yqtVar;
            }
        }
        return yqtVar;
    }
}
