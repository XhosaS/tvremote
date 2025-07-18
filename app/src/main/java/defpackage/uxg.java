package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uxg implements awg {
    final /* synthetic */ uwm a;
    final /* synthetic */ String b;
    final /* synthetic */ uxa c;

    public uxg(uwm uwmVar, String str, uxa uxaVar) {
        this.a = uwmVar;
        this.b = str;
        this.c = uxaVar;
    }

    @Override // defpackage.awg
    public final void a(qs qsVar) throws abxv {
        uwm uwmVar = this.a;
        String strA = uwmVar.a("xuikit_tv___current_group_selection_key");
        if (strA.startsWith(this.b)) {
            if (this.c.hasFocus()) {
                if (strA.endsWith("_FOCUS_NOT_IN_GRID")) {
                    uwmVar.b("xuikit_tv___current_group_selection_key", strA.substring(0, strA.length() - 18), true);
                }
            } else {
                if (strA.endsWith("_FOCUS_NOT_IN_GRID")) {
                    return;
                }
                uwmVar.b("xuikit_tv___current_group_selection_key", String.valueOf(strA).concat("_FOCUS_NOT_IN_GRID"), true);
            }
        }
    }
}
