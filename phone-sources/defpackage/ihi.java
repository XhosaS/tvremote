package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihi implements xmp {
    public final xmp a;

    public ihi(xmp xmpVar) {
        this.a = xmpVar;
    }

    @Override // defpackage.xmp
    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return ((Boolean) xmq.a.e(2, "UmpLibraryV2Feature__enable_family_sharing", false).et(((xmq) this.a).b)).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) xmq.a.e(3, "UmpLibraryV2Feature__enable_strong_reads_on_library_dirty_sync", true).et(((xmq) this.a).b)).booleanValue();
    }

    @Override // defpackage.xmp
    public final boolean d() {
        return this.a.d();
    }

    public final boolean e() {
        return ((Boolean) xmq.a.e(12, "UmpLibraryV2Feature__schedule_full_sync_on_app_start", true).et(((xmq) this.a).b)).booleanValue();
    }
}
