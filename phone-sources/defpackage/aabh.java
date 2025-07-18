package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aabh {
    public static final Set a;
    public JSONObject b;

    static {
        String[] strArr = {"CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT"};
        HashSet hashSet = new HashSet(228);
        for (int i = 0; i < 228; i++) {
            String str = strArr[i];
            str.getClass();
            if (!hashSet.add(str)) {
                Objects.toString(str);
                throw new IllegalArgumentException("duplicate element: ".concat(str));
            }
        }
        a = DesugarCollections.unmodifiableSet(hashSet);
    }

    public aabh(String str) {
        this.b = new JSONObject();
        if (h(str)) {
            return;
        }
        try {
            this.b = (JSONObject) new JSONTokener(str).nextValue();
        } catch (ClassCastException | JSONException unused) {
        }
    }

    public static final boolean h(String str) {
        return str == null || str.isEmpty();
    }

    public final int a() {
        return ((Integer) f("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
    }

    public final int b() {
        return ((Integer) f("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
    }

    public final int c() {
        return ((Integer) f("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
    }

    public final int d() {
        return ((Integer) f("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
    }

    public final int e() {
        return ((Integer) f("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
    }

    public final Object f(String str, String str2, Object obj, Class cls) throws JSONException {
        JSONObject jSONObject;
        if (this.b.length() == 0) {
            return obj;
        }
        try {
            jSONObject = this.b.getJSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return obj;
        }
        try {
            return cls.cast(jSONObject.get(str2));
        } catch (ClassCastException | JSONException unused2) {
            return obj;
        }
    }

    public final String g() {
        return (String) f("QUIC", "host_whitelist", null, String.class);
    }

    public final int i() {
        return vxr.aD((Boolean) f("AsyncDNS", "enable", null, Boolean.class));
    }

    public final int j() {
        return vxr.aD((Boolean) f("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
    }

    public final int k() {
        return vxr.aD((Boolean) f("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class));
    }

    public final int l() {
        return vxr.aD((Boolean) f("StaleDNS", "allow_other_network", null, Boolean.class));
    }

    public final int m() {
        return vxr.aD((Boolean) f("StaleDNS", "enable", null, Boolean.class));
    }

    public final int n() {
        return vxr.aD((Boolean) f("StaleDNS", "persist_to_disk", null, Boolean.class));
    }

    public final int o() {
        return vxr.aD((Boolean) f("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class));
    }
}
