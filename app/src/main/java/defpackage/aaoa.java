package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaoa {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final aamy d;
    private final aaod e = new aaod();

    public aaoa(Context context, aamy aamyVar) {
        this.c = context;
        this.d = aamyVar;
    }

    static long a(String str) {
        kkk.b(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private final HttpURLConnection d(URL url, String str) throws aanh {
        MessageDigest messageDigestA;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.c.getPackageName());
            aalw aalwVar = (aalw) this.d.a();
            if (aalwVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) lvq.d(aalwVar.a()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String string = null;
            try {
                Context context = this.c;
                String packageName = context.getPackageName();
                int i = klg.a;
                PackageInfo packageInfoB = kmb.a.a(context).b(packageName, 64);
                byte[] bArrDigest = (packageInfoB.signatures == null || packageInfoB.signatures.length != 1 || (messageDigestA = klg.a("SHA1")) == null) ? null : messageDigestA.digest(packageInfoB.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    char[] cArr = klo.a;
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr2 = klo.a;
                        sb.append(cArr2[(bArrDigest[i2] & 240) >>> 4]);
                        sb.append(cArr2[bArrDigest[i2] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: ".concat(String.valueOf(this.c.getPackageName())), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new aanh("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    private final URL e(String str) throws aanh {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new aanh(e.getMessage());
        }
    }

    private static void f() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void g(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", ".concat(String.valueOf(str))));
    }

    private static void h(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean i(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] j(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aaoa] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final aaoc b(String str, String str2, String str3, String str4, String str5) throws aanh {
        int responseCode;
        aaoc aaocVarA;
        aaoa aaoaVar = this;
        if (!aaoaVar.e.b()) {
            throw new aanh("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r8 = 1;
        int i = 0;
        URL urlE = aaoaVar.e(String.format("projects/%s/installations", str3));
        ?? r1 = aaoaVar;
        while (i <= r8) {
            TrafficStats.setThreadStatsTag(32769);
            ?? D = r1.d(urlE, str);
            try {
                try {
                    D.setRequestMethod("POST");
                    D.setDoOutput(r8);
                    if (str5 != null) {
                        D.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                } finally {
                    D.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("fid", str2);
                        jSONObject.put("appId", str4);
                        jSONObject.put("authVersion", "FIS_v2");
                        jSONObject.put("sdkVersion", "a:17.0.2_1p");
                        h(D, j(jSONObject));
                        responseCode = D.getResponseCode();
                        r1.e.a(responseCode);
                    } catch (JSONException e) {
                        e = e;
                        boolean z = r8 == true ? 1 : 0;
                        throw new IllegalStateException(e);
                    }
                } catch (IOException | AssertionError unused2) {
                    r1 = r8;
                    D.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                    r8 = r1;
                    r1 = this;
                }
                if (i(responseCode)) {
                    InputStream inputStream = D.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                    aaoe aaoeVarD = aaof.d();
                    aanw aanwVar = new aanw();
                    jsonReader.beginObject();
                    r8 = r8;
                    while (jsonReader.hasNext()) {
                        try {
                            String strNextName = jsonReader.nextName();
                            InputStream inputStream2 = inputStream;
                            if (strNextName.equals("name")) {
                                aanwVar.a = jsonReader.nextString();
                            } else if (strNextName.equals("fid")) {
                                aanwVar.b = jsonReader.nextString();
                            } else if (strNextName.equals("refreshToken")) {
                                aanwVar.c = jsonReader.nextString();
                            } else if (strNextName.equals("authToken")) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName2 = jsonReader.nextName();
                                    if (strNextName2.equals("token")) {
                                        ((aany) aaoeVarD).a = jsonReader.nextString();
                                    } else if (strNextName2.equals("expiresIn")) {
                                        aaoeVarD.b(a(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                aanwVar.d = aaoeVarD.a();
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                            inputStream = inputStream2;
                            r8 = 1;
                        } catch (IOException | AssertionError unused3) {
                            r1 = 1;
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    aanwVar.e = 1;
                    aaocVarA = aanwVar.a();
                    return aaocVarA;
                }
                try {
                    r1 = r8 == true ? 1 : 0;
                    g(D, str4, str, str3);
                } catch (IOException | AssertionError unused4) {
                    continue;
                }
                if (responseCode == 429) {
                    throw new aanh("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    f();
                    aanw aanwVar2 = new aanw();
                    aanwVar2.e = 2;
                    aaocVarA = aanwVar2.a();
                    return aaocVarA;
                }
                D.disconnect();
                TrafficStats.clearThreadStatsTag();
                i++;
                r8 = r1;
                r1 = this;
            } catch (JSONException e2) {
                e = e2;
            }
        }
        throw new aanh("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final aaof c(String str, String str2, String str3, String str4) throws aanh {
        int responseCode;
        aaof aaofVarA;
        if (!this.e.b()) {
            throw new aanh("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlE = e(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionD = d(urlE, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod("POST");
                    httpURLConnectionD.addRequestProperty("Authorization", a.j(str4, "FIS_v2 "));
                    httpURLConnectionD.setDoOutput(true);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdkVersion", "a:17.0.2_1p");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        h(httpURLConnectionD, j(jSONObject2));
                        responseCode = httpURLConnectionD.getResponseCode();
                        this.e.a(responseCode);
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    InputStream inputStream = httpURLConnectionD.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                    aaoe aaoeVarD = aaof.d();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        if (strNextName.equals("token")) {
                            ((aany) aaoeVarD).a = jsonReader.nextString();
                        } else if (strNextName.equals("expiresIn")) {
                            aaoeVarD.b(a(jsonReader.nextString()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    ((aany) aaoeVarD).b = 1;
                    aaofVarA = aaoeVarD.a();
                } else {
                    g(httpURLConnectionD, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        aaoe aaoeVarD2 = aaof.d();
                        ((aany) aaoeVarD2).b = 3;
                        aaofVarA = aaoeVarD2.a();
                    } else {
                        if (responseCode == 429) {
                            throw new aanh("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            f();
                            aaoe aaoeVarD3 = aaof.d();
                            ((aany) aaoeVarD3).b = 2;
                            aaofVarA = aaoeVarD3.a();
                        } else {
                            httpURLConnectionD.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                }
                return aaofVarA;
            } finally {
                httpURLConnectionD.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new aanh("Firebase Installations Service is unavailable. Please try again later.");
    }
}
