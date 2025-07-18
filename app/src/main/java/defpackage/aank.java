package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aank implements aann {
    final lvj a;

    public aank(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.aann
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.aann
    public final boolean b(aanv aanvVar) {
        if (!aanvVar.m() && !aanvVar.l() && !aanvVar.j()) {
            return false;
        }
        lvj lvjVar = this.a;
        lvjVar.a.s(((aanr) aanvVar).a);
        return true;
    }
}
