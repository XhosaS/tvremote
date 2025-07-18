package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface lkl extends lkk {
    public static final String[] b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;

    static {
        String[] strArr = (String[]) lkk.a.toArray(new String[0]);
        int i2 = mei.a;
        int length = strArr.length;
        String[] strArr2 = new String[length + 12];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        System.arraycopy(new String[]{"pinning_download_size", "download_relative_filepath", "download_bytes_downloaded", "download_extra_proto", "license_type", "license_cenc_key_set_id", "license_cenc_security_level", "resume_timestamp", "last_watched_timestamp", "(pinned IS NOT NULL AND pinned > 0)", "external_storage_index", "pinning_status = 3"}, 0, strArr2, length, 12);
        b = strArr2;
        c = lkk.a.size();
        d = lkk.a.size() + 1;
        e = lkk.a.size() + 2;
        f = lkk.a.size() + 3;
        g = lkk.a.size() + 4;
        h = lkk.a.size() + 5;
        i = lkk.a.size() + 6;
        j = lkk.a.size() + 7;
        k = lkk.a.size() + 8;
        l = lkk.a.size() + 9;
        m = lkk.a.size() + 10;
        n = lkk.a.size() + 11;
    }
}
