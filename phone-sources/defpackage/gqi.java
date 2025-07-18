package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqi extends ggi {
    public static final gqi c = new gqi();

    private gqi() {
        super(12, 13);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        ghkVar.f("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
