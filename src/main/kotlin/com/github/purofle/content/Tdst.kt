package com.github.purofle.content

import arc.Core
import arc.Net
import arc.func.Cons

class Tdst {
    init {
        Core.net.httpGet("124.70.189.178:5000", { res: Net.HttpResponse? -> }) { error: Throwable? -> }
    }
}