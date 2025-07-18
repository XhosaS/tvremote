package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
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
public final class uoa {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final unj d;
    private final uoc e = new uoc();

    public uoa(Context context, unj unjVar) {
        this.c = context;
        this.d = unjVar;
    }

    static long a(String str) {
        ocv.au(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private final HttpURLConnection d(URL url, String str) throws uno {
        MessageDigest messageDigestA;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(WVMediaCrypto.TYPE);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(WVMediaCrypto.TYPE);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.c.getPackageName());
            umv umvVar = (umv) this.d.a();
            if (umvVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) osk.s(umvVar.a()));
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
                int i = oco.a;
                PackageInfo packageInfoZ = oda.b(context).z(packageName, 64);
                byte[] bArrDigest = (packageInfoZ.signatures == null || packageInfoZ.signatures.length != 1 || (messageDigestA = oco.a("SHA1")) == null) ? null : messageDigestA.digest(packageInfoZ.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    char[] cArr = ocr.a;
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr2 = ocr.a;
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
            throw new uno("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void f(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
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

    private static void g(URLConnection uRLConnection, byte[] bArr) throws IOException {
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

    private static boolean h(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL j(String str) throws uno {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new uno(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final uob b(String str, String str2, String str3, String str4, String str5) throws uno {
        JSONObject jSONObject;
        int responseCode;
        uob uobVar;
        InputStream inputStream;
        InputStream inputStream2;
        uoa uoaVar = this;
        if (!uoaVar.e.b()) {
            throw new uno("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r8 = 1;
        int i = 0;
        URL urlJ = j(String.format("projects/%s/installations", str3));
        while (i <= r8) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionD = uoaVar.d(urlJ, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod("POST");
                    httpURLConnectionD.setDoOutput(r8);
                    if (str5 != null) {
                        httpURLConnectionD.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        jSONObject = new JSONObject();
                    } catch (JSONException e) {
                        e = e;
                    }
                    try {
                        try {
                            jSONObject.put("fid", str2);
                            jSONObject.put("appId", str4);
                            jSONObject.put("authVersion", "FIS_v2");
                            jSONObject.put("sdkVersion", "a:17.0.2_1p");
                            g(httpURLConnectionD, i(jSONObject));
                            responseCode = httpURLConnectionD.getResponseCode();
                            uoaVar.e.a(responseCode);
                        } catch (IOException | AssertionError unused) {
                            continue;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (h(responseCode)) {
                    InputStream inputStream3 = httpURLConnectionD.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream3, b));
                    uod uodVarA = uoe.a();
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    uoe uoeVarA = null;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        if (strNextName.equals("name")) {
                            strNextString = jsonReader.nextString();
                        } else if (strNextName.equals("fid")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (strNextName.equals("refreshToken")) {
                            strNextString3 = jsonReader.nextString();
                        } else {
                            if (strNextName.equals("authToken")) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName2 = jsonReader.nextName();
                                    if (strNextName2.equals("token")) {
                                        uodVarA.b = jsonReader.nextString();
                                    } else {
                                        if (strNextName2.equals("expiresIn")) {
                                            inputStream2 = inputStream3;
                                            uodVarA.b(a(jsonReader.nextString()));
                                        } else {
                                            inputStream2 = inputStream3;
                                            jsonReader.skipValue();
                                        }
                                        inputStream3 = inputStream2;
                                    }
                                }
                                inputStream = inputStream3;
                                uoeVarA = uodVarA.a();
                                jsonReader.endObject();
                            } else {
                                inputStream = inputStream3;
                                jsonReader.skipValue();
                            }
                            inputStream3 = inputStream;
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream3.close();
                    uobVar = new uob(strNextString, strNextString2, strNextString3, uoeVarA, 1);
                } else {
                    f(httpURLConnectionD, str4, str, str3);
                    if (responseCode == 429) {
                        throw new uno("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        e();
                        uobVar = new uob(null, null, null, null, 2);
                    } else {
                        httpURLConnectionD.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        r8 = 1;
                        uoaVar = this;
                    }
                }
                return uobVar;
            } finally {
                httpURLConnectionD.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new uno("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final uoe c(String str, String str2, String str3, String str4) throws uno {
        uoe uoeVarA;
        if (!this.e.b()) {
            throw new uno("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlJ = j(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionD = d(urlJ, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod("POST");
                    httpURLConnectionD.addRequestProperty("Authorization", a.cr(str4, "FIS_v2 "));
                    httpURLConnectionD.setDoOutput(true);
                } catch (IOException | AssertionError unused) {
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sdkVersion", "a:17.0.2_1p");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("installation", jSONObject);
                    g(httpURLConnectionD, i(jSONObject2));
                    int responseCode = httpURLConnectionD.getResponseCode();
                    this.e.a(responseCode);
                    if (h(responseCode)) {
                        InputStream inputStream = httpURLConnectionD.getInputStream();
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                        uod uodVarA = uoe.a();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            if (strNextName.equals("token")) {
                                uodVarA.b = jsonReader.nextString();
                            } else if (strNextName.equals("expiresIn")) {
                                uodVarA.b(a(jsonReader.nextString()));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        jsonReader.close();
                        inputStream.close();
                        uodVarA.a = 1;
                        uoeVarA = uodVarA.a();
                    } else {
                        f(httpURLConnectionD, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            uod uodVarA2 = uoe.a();
                            uodVarA2.a = 3;
                            uoeVarA = uodVarA2.a();
                        } else {
                            if (responseCode == 429) {
                                throw new uno("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                e();
                                uod uodVarA3 = uoe.a();
                                uodVarA3.a = 2;
                                uoeVarA = uodVarA3.a();
                            } else {
                                httpURLConnectionD.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        }
                    }
                    return uoeVarA;
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            } finally {
                httpURLConnectionD.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new uno("Firebase Installations Service is unavailable. Please try again later.");
    }
}
