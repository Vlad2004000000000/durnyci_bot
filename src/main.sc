require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Почнемо.

    state: Hello
        intent!: /hello
        a: Прівіт прівіт

    state: Bye
        intent!: /bye
        a: Пока

    state: KnowledgeBase
        intentGroup!: /KnowledgeBase
        a: Я знайшов відповідь у базі знань!
        script: $faq.pushReplies();

    state: NoMatch
        event!: noMatch
        a: Не зрозумів. Ви сказали:: {{$request.query}}
