package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aant {
    private File a;
    private final aahf b;

    public aant(aahf aahfVar) {
        this.b = aahfVar;
    }

    private final File c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    aahf aahfVar = this.b;
                    aahfVar.d();
                    this.a = new File(aahfVar.c.getFilesDir(), "PersistedInstallation." + aahfVar.c() + ".json");
                }
            }
        }
        return this.a;
    }

    public final aanv a() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        aanu aanuVarI = aanv.i();
        aanq aanqVar = (aanq) aanuVarI;
        aanqVar.a = strOptString;
        aanuVarI.c(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        aanqVar.b = strOptString2;
        aanqVar.c = strOptString3;
        aanuVarI.d(jOptLong);
        aanuVarI.b(jOptLong2);
        aanqVar.d = strOptString4;
        return aanuVarI.a();
    }

    public final void b(aanv aanvVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ((aanr) aanvVar).a);
            int i = ((aanr) aanvVar).g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", ((aanr) aanvVar).b);
            jSONObject.put("RefreshToken", ((aanr) aanvVar).c);
            jSONObject.put("TokenCreationEpochInSecs", ((aanr) aanvVar).e);
            jSONObject.put("ExpiresInSecs", ((aanr) aanvVar).d);
            jSONObject.put("FisError", ((aanr) aanvVar).f);
            aahf aahfVar = this.b;
            aahfVar.d();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", aahfVar.c.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}
